package Recursions.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,7,6,9};
//        System.out.println(findValue(arr, 7, 0 ));
//        System.out.println(findIndex(arr, 5,0));
//        System.out.println(findIndexLast(arr, 6, arr.length-1));
//
//        findAllIndex(arr, 7,0);
//        System.out.println(list);
//        System.out.println(findAllIndex(arr, 7, 0, new ArrayList<>()));

        System.out.println(findAllIndex2(arr, 7, 0));
    }

    static boolean findValue(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || findValue(arr, target, index +1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr, target, index +1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return findIndexLast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    //Don;t use this approach as you are creating list again and again, use the above approach
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
        //this will contain the ans for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> returnAllBelowAns = findAllIndex2(arr, target, index + 1);
        list.addAll(returnAllBelowAns);
        return list;
    }
}
