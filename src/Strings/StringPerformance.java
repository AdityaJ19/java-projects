package Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
            //System.out.println(ch);
        }
        // this is bad code practice because when we run this loop firstly 'a' will be printed
        //then "a" + 'b' will concatenate and will print ab but after iterating for 26 times will be get the output
        //abcdefghijklmnopqrstuvwxyz but all the trailing value will have no reference variable so they will occupy
        //waste space which we do not want
        System.out.println(series);
    }
}
