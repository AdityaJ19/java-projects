package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,12,45,56,87,98,124,566,876,1245};
        int target = 3;
        System.out.println(floorNumber(arr, target));
    }
    static int floorNumber(int[] arr, int target){
        // what if the target is greater than the greatest element then return -1
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid +1;
            }
            //if the target element == mid
            else{
                return mid;
            }
        }
        return end;
    }
}
