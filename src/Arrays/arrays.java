package Arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers=new int[size];
        //input
        for (int i = 0; i <size ; i++) {
            numbers[i]=sc.nextInt();
        }

        int x= sc.nextInt();

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]==x){
                System.out.println("x found at index : "+ i);
            }
        }
//        int[] marks = new int[5];
//        marks[0]=94;
//        marks[1]=81;
//        marks[2]=74;
//        marks[3]=78;
//        marks[4]=48;
        //output
//        for (int i = 0; i <size ; i++) {
//            System.out.println(numbers[i]);
//        }
    }
}
