package Topics;

public class string_builder {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("tony");
        System.out.println(sb);

        //postion of char in string
        System.out.println(sb.charAt(0));

        //replace a char in string
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //nsert inside a string
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete the char in string
        sb.delete(0,1);
        System.out.println(sb);

        //append=inserting a char at the end of string
        sb.append('k');
        sb.append('r');
        sb.append('u');
        sb.append('g');
        sb.append('e');
        sb.append('r');
        System.out.println(sb);
    }
}
