package Topics;

public class break_continue_17 {
    public static void main(String[] args) {
//        for (int i=5; i<10; i++){
//            System.out.println(i);
//            System.out.println("this is best coding ");
//            if (i==7){
//                System.out.println("this is end of loop");
//                break;
//        }
//        }
//        int a=0;
//        do{
//            System.out.println(a);
//            System.out.println("this is do while loop");
//            if(a==2){
//                System.out.println("this is end");
//                break;
//            }
//            a++;
//        }
//        while(a<5);

//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("this is coding");
//            if(i==3){
//                System.out.println("this is the end");
//                break;
//            }
//            i++;
//        }

//                for (int i=5; i<10; i++){
//            if (i==7) {
//                System.out.println("this is end of loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("this is best coding ");
//        }
        int a=0;
        do{
            a++;
            if(a==2){
                System.out.println("this is end");
                continue;
            }
            System.out.println(a);
            System.out.println("this is do while loop");
        }
        while(a<5);
        System.out.println("print this line");
//
//        int i=0;
//        while(i<5){
//            System.out.println(i);
//            System.out.println("this is coding");
//            if(i==3){
//                System.out.println("this is the end");
//                break;
//            }
//            i++;
//        }
    }

}
