package Recursions;

public class NumbersExample {
    //write a functions the prints the number from 1 to 5
    //recursion is a function calling another function
    public static void main(String[] args) {
        numbers(1);
    }
    static void numbers(int n){
        System.out.println(n);
        numbers1(2);
    }
    static void numbers1(int n){
        System.out.println(n);
        numbers2(3);
    }
    static void numbers2(int n){
        System.out.println(n);
        numbers3(4);
    }
    static void numbers3(int n){
        System.out.println(n);
        numbers4(5);
    }
    static void numbers4(int n){
        System.out.println(n);
    }
}
