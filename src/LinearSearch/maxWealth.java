package LinearSearch;

public class maxWealth {
    public static void main(String[] args) {

    }
    static int maximumWealth(int[][] accounts) {
        //row = person
        //col = account
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new col take a sum of that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
