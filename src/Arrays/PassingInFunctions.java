package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int arr[]){
        arr[0] = 99;
    }
}
