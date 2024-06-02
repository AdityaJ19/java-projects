package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Array of primitve
        int arr[] = new int[5];
        arr[0] = 19;
        arr[1] = 22;
        arr[2] = 45;
        arr[3] = 23;
        arr[4] = 65;
        System.out.println(arr[4]);

        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        // Enhanced for loop for array
//        for (int j : arr) { // for every element in the array, print the element
//            System.out.print(j + " "); // here (j) represents the elements in array
//        }
//        System.out.println(arr[5]); // index out of bound


        //Array of objects
        String[] name = new String[4];
        for (int i = 0; i <name.length ; i++) {
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));

        name[1] = "Aditya";
        System.out.println(Arrays.toString(name));
    }
}
