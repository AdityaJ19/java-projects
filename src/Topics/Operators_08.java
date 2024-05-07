package Topics;

import java.util.Scanner;
public class Operators_08 {
    public static void main(String[] args) {
        int ans =sum2();
        System.out.println(ans);
    }
    // return the value
    static int sum2(){

        Scanner S=new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = S.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = S.nextInt();

        int sum= num1+num2;
        return sum;
    }
        static void sum(){
        Scanner S=new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = S.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = S.nextInt();

        int sum= num1+num2;
        System.out.println("The total sum is: " + sum);
//        int a =4;
//        a *= 4;
//        System.out.println(a);
//        System.out.println(54>3 && 45>34);
//        System.out.println(34>23 || 23<12);

    }
}
