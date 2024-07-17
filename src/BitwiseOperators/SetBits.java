package BitwiseOperators;

public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(toSetBits(n));

    }

    static int toSetBits(int n) {
        int counter = 0;
//        while(n>0){
//            counter++;
//            n -= (n& -n);
//        }
        while (n>0){
            counter++;
            n = n & (n-1);
        }
        return counter;

    }
}
