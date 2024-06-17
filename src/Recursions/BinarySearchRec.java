package Recursions;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,24,65,78};
        int target = 4;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
    //start and end will go to the arguments function from where the future functions will be called by start and end
    static int binarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        //Body of the function
            int mid = s+(e-s)/2;

        if(arr[mid]== target){
            return mid;
        }
        if(target < arr[mid]){
            //whenever you are calling any recursion calls,
            // make sure you are returning it if there is a return type
           return binarySearch(arr, target, s, mid-1);
        }
        return binarySearch(arr, target, mid+1, e);
    }
}
