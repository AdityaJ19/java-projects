package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // Question:- Why size is not fixed in Arraylist here it says only 5 list
        // can be stored but actually we can store as many values as we want to so how?
//        list.add(45);
//        list.add(23);
//        list.add(43);
//        list.add(56);
//        list.add(564);
//        list.add(4224);
//        System.out.println(list);
//
//        list.set(2, 345);
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  //pass the index here, list[index] syntax will not work here
        }
        System.out.println();
    }
}

// in Arraylist not every element can be a primitive data type as it doesn't allow it
