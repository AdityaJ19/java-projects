package Exercises;

import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        char ch=S.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("upercase");
        }
    }
}
