package Arrays;

public class jaggedArray {
    public static void main(String[] args) {
        //In 2-D array rows are mandatory to specify and columns can be neglected
//        int[][] arr = new int[3][];
        int[][] nums  = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                //since Math.random generates less than 1 value so that's why
                // we multiplied it with 10 to give 10's digit number
                nums[row][col] = (int)(Math.random() * 10);
            }
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
