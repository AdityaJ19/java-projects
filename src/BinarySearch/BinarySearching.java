package BinarySearch;

public class BinarySearching {
    public static void main(String[] args) {
        //Assumed that binary is sorted in either Ascending or Descending order
        int[] arr = {2,4,6,7,8,12,45,56,87,98,124,566,876,1245};
        int target = 124;
        System.out.println(binarySearch(arr, target));
    }
    //return the index
    //return -1 if it doesn't contain the element
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //Find the middle element of the array
//            int mid = (start+end)/2; // Might be possible that (start+end) exceeds the range of integer so
            //New improved method is
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            //if the target element == mid
            else{
                return mid;
            }
        }
        return -1;
    }
}
