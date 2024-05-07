package Topics;

import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int var=S.nextInt();
        String A=S.next();

        switch (var) {
            case 1 -> System.out.println("my name is khan");
            case 2 -> System.out.println("my name is sharukh khan");
            case 3 -> {
                System.out.println("Enter your name");

                switch (A) {
                    case "Aditya" -> System.out.println("this is jangra boy");
                    case "Arpit" -> System.out.println("this is garg");
                }
            }
            default -> System.out.println("please enter the required details");
        }
    }
}
