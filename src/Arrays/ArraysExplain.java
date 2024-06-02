package Arrays;

public class ArraysExplain {
    public static void main(String[] args) {
        //Declaration of an array
//        int rols[] = new int[5];

        int rols[]; // here is the declaration of an array, rols is stored in the stack memory
        // this above declaration happens at compile time
        // this below initialisation happens at run time
        rols = new int[5];  // now here the object is created in the heap memory
    }
}
//in Java there are no concept of pointers so like in java it depends upon
// JVM whether it will be continuously stored or not because,
//1) arrays objects are stored in heap memory
//2) dynamic memory allocation
//3) heap objects are not continuous
// c/c++ the arrays are stored continuously in memory