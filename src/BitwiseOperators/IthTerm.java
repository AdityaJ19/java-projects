package BitwiseOperators;

public class IthTerm {
    public static void main(String[] args) {
        int num = 110110010;
        int i = 3;
        System.out.println(getIthBit(num,i));
    }
    public static boolean getIthBit(int num, int i) {
        return ((num >> (i - 1)) & 1) == 1;
    }
}
