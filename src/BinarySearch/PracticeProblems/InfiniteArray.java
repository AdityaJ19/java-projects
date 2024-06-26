package BinarySearch.PracticeProblems;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,6,10,12,23,34,45,56,67,78,89,90,121,123};
        int target = 45;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end+1;
            // double the size of the box
            // end = previous end + sizeofbox*2
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
