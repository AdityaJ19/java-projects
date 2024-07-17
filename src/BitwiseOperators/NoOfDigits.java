package BitwiseOperators;

public class NoOfDigits {
    public static void main(String[] args) {
        //Binary
        int n = 10;
        int b = 2;
        //Decimal
//        int n = 3456;
//        int b = 10;

        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
