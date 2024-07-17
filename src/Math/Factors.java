package Math;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        divisors2(20);
    }

    // O(n)
    static void divisors(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.println(i+ " ");
            }
        }
    }

    //O(root(n))
    static void divisors1(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i+ " " + n/i + " ");
                }
            }
        }
    }
    //Both time and space will be O(sqrt(n)) because we are now storing the values in the arraylist
    static void divisors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i);
                }else{
                    System.out.print(i+ " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
