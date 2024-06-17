package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max item will come at last respective place
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous element
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            //if you didn't swap for a particular value of i,  then the array is sorted and break the program
            if(!swapped){
                break;
            }
        }
    }
}
