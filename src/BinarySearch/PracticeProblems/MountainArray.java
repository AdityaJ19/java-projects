package BinarySearch.PracticeProblems;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 4, 3,1};
        System.out.println(peakMountainArray(arr));
    }
    static int peakMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the decreasing order
                //this may be the possible ans but look at left
                //this is why end != end-1
                end = mid;
            }else {
                //you are in the ascending part of an array
                start = mid+1; //because mid+1 element is greater than mid element hence we ignore that
            }
        }
        //in the end start == end and pointing to the largest number because of 2 check above
        //start and end are always trying to find the max element in the 2 checks above
        //when they are pointing to just one element, that is the max element because that is wat check say
        return start; //or return end cause both are equal
    }
}
