package StringBuffer;
import java.util.Arrays;
import java.util.Random;
public class Buffer {
    public static void main(String[] args) {
        //Constructor 1
        StringBuffer sb = new StringBuffer();

        //Constructor 2
        StringBuffer sb2 = new StringBuffer("Aditya Jangra");

        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Aditya is learning java");
        sb.insert(2, " Akash ");
        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String arr = "Aditya Arpit Dushyant Himanshu Rahul";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

    }
}
