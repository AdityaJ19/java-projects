package BitwiseOperators;

public class OccurenceOnce {
    public static void main(String[] args) {
        int[] arr= {2,3,1,2,3,4,6,4,1};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
