package Recursions;

public class NumbersExampleRecursion {
    //write a functions the prints the number from 1 to 5
    //recursion is a function calling another function
    //recursion is a function that call itself
    public static void main(String[] args) {
        numbers(1);
    }
    static void numbers(int n){

        //Base condition to protect our code from making new calls, it is necessary to provide in recursions
        //if we are calling a function again and again, you can treat it as a separate function in stack
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //this is tail recursion
        //this is the last function call
        numbers(n+1);
    }
}
