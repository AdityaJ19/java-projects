import java.util.Scanner;
public class Conditionals_13 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=S.nextInt();
        if (age>18){
            System.out.println("You are eligible for driver licensce");
        }
        else {
            System.out.println("Grow up would ya!");
        }
        
    }
}
