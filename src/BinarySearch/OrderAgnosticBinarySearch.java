package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,12,45,56,87,98,124,566,876,1245};
        int target = 124;
        System.out.println(orderAgnosticBS(arr, target));
        //What if we don't know that the arr is sorted or not
    }
    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start]< arr[end];
//        if(arr[start]< arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }

        while(start <= end){

            int mid = start + (end - start)/2;
            //Common answer if the target element is middle return middle
            if(arr[mid] == target){
                return mid;
            }
            //Condition if isAsc
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                } else{
                    start = mid +1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                } else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
