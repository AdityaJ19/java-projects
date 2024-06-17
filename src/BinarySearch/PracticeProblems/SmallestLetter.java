package BinarySearch.PracticeProblems;

//Step1- Exact same approach as we used in Ceiling of a number.
//Step2- Ignore the target = what we are calling we only need > than the target char but it should be smallest.
//Step3- Warp the Characters i.e arr=['c', 'f', 'g', 'j'] and the target element is 'j'
// then the output returned will be c cause we don't have any char greater then 'j'.
// so it wraps around the arr and we get arr[0] as output
//Step4- We will use modulo operator to get the output as we know when loop violates
// start = end+1 that is arr.length
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
            //if the target element == mid
        }
        return letters[start % letters.length];
    }
}
