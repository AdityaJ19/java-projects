package BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        // it is not a completely sorted array so we cannot apply binary search on this
        int[][] arr ={
                //start pointer is r{0,0} for lower bound and c{arr.length-1}{0,3} is upper bound
                //so if the target element is less than the upper bound then c-- and now the new
                //upper bound is {0,2} and this process is repeated until we find our element.
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {18, 28, 38, 48},
                {22, 32, 42, 52}
        };
        System.out.println(Arrays.toString(search(arr, 38)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c > 0){
            // check for the element == target we return the answer
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }
            //check if the element is less than the target row++
            if (matrix[r][c] < target){
                r++;
            }else{
                //if the element is greater than the target column--
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
