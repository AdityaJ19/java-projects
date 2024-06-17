package Stringbuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' +i);
            builder.append(ch);
        }
        //so now it is not creating new objects every time the loop iterates
        // but it makes changes in the first object that has been created
        System.out.println(builder.toString());
    }
}
