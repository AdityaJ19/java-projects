package LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr ={
                {3,5,7,2},
                {1,4,6},
                {9,8,11}
        };
        int target = 8;
        int[] ans = search(arr, target); //format of return values {rows, cols}
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    // Program for Maximum value in 2D array
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]> max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    //Program for Searching in 2D array
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

