package Strings;
//https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=daily-question&envId=2024-06-01
public class ReverseString {
//    static void reverseString(char[] s) {
//        StringBuilder reverse = new StringBuilder(new String(s)).reverse();
//        for (int i = 0; i < s.length; i++) {
//            s[i] = reverse.charAt(i);
//        }
//    }
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;

        while(l <=  r){
            char temp;
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;

        }

    }
}
