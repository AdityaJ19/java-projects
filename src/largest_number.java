import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int a= S.nextInt();
        int b= S.nextInt();
        int c= S.nextInt();


//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
