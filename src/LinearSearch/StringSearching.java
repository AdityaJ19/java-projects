package LinearSearch;

public class StringSearching {

    public static void main(String[] args) {
        String name = "Aditya";
        char target = 't';
        System.out.println(search(name, target));
    }
    public static boolean search(String str, int target){
        if (str.isEmpty()){
            return false;
        }

        for (int chr = 0; chr < str.length(); chr++) {
            if(target == str.charAt(chr)){
                return true;
            }
        }
        return false;
    }
}
