import java.util.*;

public class LargestNum {

    public static int  largestNumber(int numbers[]) {
            int largest =  Integer.MIN_VALUE;
            for(int i=0; i< numbers.length;i++){
                if(numbers[i]>largest){
                    largest  = numbers[i];
                }
            }
            return largest;
        }
    
    public static void main(String[] args) {

    int numbers[]={1,2,5,55,444,888};

    System.out.println("largest value in the array is: " + largestNumber(numbers));
}}