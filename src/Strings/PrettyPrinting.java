package Strings;
//PlaceHolders in Java
public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 344.2314f;
        //so %.2f means that we need the decimal value up to 2 digits and it rounds of as well
        //System.out.printf("the formatted version is %.2f", a);
        //System.out.printf("Pie : %.3f", Math.PI);

        //%s is a string type so in order which we have placed them only in that order we must define their values
        System.out.printf("Hello my name is %s and i am %s", "Aditya", "Intelligent");
    }
}
