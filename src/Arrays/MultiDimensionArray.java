package Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        //In 2-D array rows are mandatory to specify and columns can be neglected
//        int[][] arr = new int[3][];
        int[][] nums  = new int[3][4];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                //since Math.random generates less than 1 value so that's why
                // we multiplied it with 10 to give 10's digit number
                nums[row][col] = (int)(Math.random() * 10);
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
        //using enhanced for loop
        for(int[] n : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
