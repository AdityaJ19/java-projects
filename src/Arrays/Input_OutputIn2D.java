package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input_OutputIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // it will print no of rows

        // Input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= sc.nextInt();
            }
        }

        // Output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        // Short Output
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //Enhanced for Loop Output
        for(int[] a : arr){  //data type of every single element in this array itself is an array
            System.out.println(Arrays.toString(a));
        }
    }
}
