package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Aditya";
        String c = a;
        System.out.println(c==b);
        //== is a comparator
        //System.out.println(a==b);


        String name1 = new String("Aditya");
        String name2 = new String("Aditya");
        System.out.println(name1.charAt(0));
        // when you need to check values use .equal method
        System.out.println(name1.equals(name2));
    }
}
