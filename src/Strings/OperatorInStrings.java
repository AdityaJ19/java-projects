package Strings;

import ArrayLists.ArrayList1;

import java.util.ArrayList;

public class OperatorInStrings {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        // when 2 strings combine it is called concatenation
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a"+ 3);
        System.out.println("a" + 'b');
        //when an integer is concatenated(added) with the string it is
        // converted into its wrapper(int - Integer) class and that will call .toString()
        System.out.println("Aditya" + new ArrayList<>());
        //System.out.println("Aditya" + new Integer(56));

        //operator + in java is defined for primitive or if any of these values is a String
        //at least one of these object must be a string and the output will be a string type
        //System.out.println(new ArrayList<>() +""+ new Integer(34));
    }
}
