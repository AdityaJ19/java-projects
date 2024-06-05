package LinearSearch;

public class LinearSearching {
    public static void main(String[] args) {
        int[] nums = {78,65,42,13,98};
        int target = 13;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
    }

    //Search the target and return boolean
    static boolean LinearSearch3(int[] arr, int target){
        if (arr.length ==0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
    //Search the target and return the Element
    static int LinearSearch1(int[] arr, int target){

        if (arr.length ==0){
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    //search in the array: return the index of item found
    //otherwise return -1 if item not found
    static int LinearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }

        //run the for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute oif non of the above statement above have executed
        //hence the target is -1
        return -1;
    }
}
