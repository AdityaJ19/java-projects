package Recursions;

public class HelloWorld {
    public static void main(String[] args) {
        Greeting();
//        Greeting1();
//        Greeting2();
//        Greeting3();
//        Greeting4();
    }
    static void Greeting(){
        System.out.println("Hello World");
        Greeting1();
    }
    static void Greeting1(){
        System.out.println("Hello World");
        Greeting2();
    }
    static void Greeting2(){
        System.out.println("Hello World");
        Greeting3();
    }
    static void Greeting3(){
        System.out.println("Hello World");
        Greeting4();
    }
    static void Greeting4(){
        System.out.println("Hello World");
    }
}
