package LinearSearch;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {34, 45, 12, 44, 78,55};
        int target = 12;
        System.out.println(LinearSearch(arr, target, 0, 4));

    }
    static int LinearSearch(int[] arr, int target, int start, int end){
        if (arr.length ==0){
            return -1;
        }

        //run the for loop
        for (int index = start; index < end; index++) {
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
