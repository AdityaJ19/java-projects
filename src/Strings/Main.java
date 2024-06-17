package Strings;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = {2,4,5,6,7};
        //reference variable arr and a pointing toward the object in heap like 10 and {2,4,5,6,7}

        String name = "Aditya";
        //String is a data type which stores a collection of characters,
        // they are immutable hence you can not change the value.
        //to change the value you need to create a new object
        System.out.println(name);

        name = "Rahul";
        System.out.println(name);
        // Here's both Aditya and Rahul printed and i just said that Strings are immutable so how,
        //Well it didn't mutate we just created a new object of name = "Rahul" in heap memory
        //and the first object will be deleted by garbage collection
    }
}
