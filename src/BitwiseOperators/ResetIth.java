package BitwiseOperators;

public class ResetIth {
    public static void main(String[] args) {
        int num = 110110010;
        int i = 3;
        System.out.println(getIthBit(num,i));
    }
    public static boolean getIthBit(int num, int i) {
        //just compliment the no. and this will execute for 0 bit as true and 1 for false
        return ((num >> (i - 1)) & 1) != 1;
    }
}
