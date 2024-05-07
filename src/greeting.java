public class greeting {
    public static void main(String[] args) {
//        String message= greet();
//        System.out.println(message);

        String personalised = mygreet("Aditya Jangra");
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message="Hello " + name;
                return message;
    }

    static String greet() {
        String greeting="How are you";
        return greeting;
    }
}


/* return_type name (arguements) {
        //body
        return statement;
        }
 */