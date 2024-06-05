package Arrays;

public class EvenDigits {

    //we have to find the even digits no in the following given array
    //arr{24, 4, 6, 345, 2746} so in this array 24 is 2 digits so it's even
    // 4 and 6 even though they are even numbers the digits are only 1 so we won't need them
    // 2746 again contains 4 digits which is even so only 24 and 2746 will be printed
    public static void main(String[] args) {
        int[] nums ={24, 15, 4, 3, 7455,69};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        int noOfDigits = digits(nums);
        return noOfDigits % 2 == 0;
//        if(noOfDigits % 2 ==0){
//            return true;
//        }
//        return false;
    }
    // to count the no of digits
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}

