package Exercises;

public class MaxItemArray {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 4 , 7 , 9};
        System.out.println(maxRange(arr, 0, 5));
    }

    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[0];
        for (int i = start; i < end ; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Max Value Program
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
