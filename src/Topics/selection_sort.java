package Topics;

public class selection_sort {
    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,3,7,1,9};
        
        for (int i = 0; i <arr.length-1 ; i++) {
            int samllest=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[samllest]>arr[j]){
                    samllest=j;
                }
            }
            int temp=arr[samllest];
            arr[samllest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
