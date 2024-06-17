package BinarySearch;

import java.util.Arrays;

public class BSInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr, 11)));
    }
    //search in the row provided in between the column provided
    static int[] matrixSearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }if(matrix[row][mid] < target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[] {-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length; // be cautious over here as it can be a 1D array or empty

        if (row==1){
            return matrixSearch(matrix, 0, 0, col - 1, target);
        }
        //run the loop till two rows are remaining
        int rStart =0;
        int rEnd = row-1;
        int cMid = col/2;

        while(rStart < (rEnd -1)){
            //while this is true matrix will contain more than 2 rows
            int mid = rStart + (rEnd -rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            //when this condition is true we ignore the above rows
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            // when this condition is true we ignore the below rows
            else {
                rEnd = mid;
            }
        }

        //Now we have 2 rows.
        //Check whether the target is in the column of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart+1][cMid] < target){
            return new int[]{rStart+1, cMid};
        }
        //we divide the 2 rows into 4 parts
        //search in 1st half
        if(target <= matrix[rStart][cMid-1]){
            return matrixSearch(matrix, rStart, 0, cMid - 1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
            return matrixSearch(matrix, rStart, cMid+1, col - 1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            return matrixSearch(matrix, rStart+1, 0, cMid - 1, target);
        }
        //search in 4th half
        else{
            return matrixSearch(matrix, rStart+1, cMid+1, col - 1, target);
        }
    }
}
