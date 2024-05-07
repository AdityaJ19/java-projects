package Topics;

import java.util.Scanner;
public class Switch_15 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int var=S.nextInt();

        switch (var){
            case 18:
                System.out.println("Welcome to adulthood");
                break;
            case 21:
                System.out.println("Get ready for a job");
                break;
            case 26:
                System.out.println("Get ready to be settled");
                break;
            default:
                System.out.println("Enjoy your fucking life");
        }
        System.out.println("This is the circle of life");


        /*

        IF-ELSE-IF LADDER

        System.out.println("Enter your Age: ");
        int age=S.nextInt();
        if (age<18){
            System.out.println("you are eligible for hostel");
        }
        else if (age>25) {
            System.out.println("you are eligible for marriage");
        }
        else{
            System.out.println("you are in-experienced");
        }

        */
    }
}
