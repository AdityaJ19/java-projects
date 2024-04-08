import java.util.Scanner;
public class calculator_program {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        // take input from the user till the user doesn't press X or x
        int ans=0;
        while(true){
            //taking value as operator
            System.out.println("Enter the Operator:");
            char op=S.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
                //input 2 numbers
                System.out.println("Enter Two Numbers:");
            }
            int num1=S.nextInt();
            int num2=S.nextInt();

            if(op=='+'){
                ans=num1+num2;
            }
            if(op=='-'){
                ans=num1-num2;
            }
            if(op=='*'){
                ans=num1*num2;
            }
            if(op=='/'){
                if(num2!=0){
                    ans=num1/num2;
                }
            }
            if(op=='%'){
                ans=num1%num2;
            }
            else if(op=='x' || op=='X') {
                break;
            }else{
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
