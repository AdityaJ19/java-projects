package Recursions;

public class fibo {
    public static void main(String[] args) {
//        System.out.println(Fibo(6));
//    }
//    static int Fibo(int n){
//        if (n<2){
//            return n;
//        }
//        return Fibo(n-1) + Fibo(n-2);
        String str = "Hello";
        String rev = "";
        int length = str.length();

        for (int i = 0; i < length; i++) {
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
