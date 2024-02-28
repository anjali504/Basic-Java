import java.util.*;

public class prefixsum{
    public static int sumPrefix( int array[]) {
        int n = array.length;
        int prefix[] = new int[n];
        int current_sum  = 0;
        int max =  Integer.MIN_VALUE;
        prefix[0] =  array[0];
        for(int i =1; i < n;i++){
            prefix[i] = prefix[i-1]+array[i];
        }
        for(int i= 1;i<n; i++){
            for( int j=i;j<n;j++){
                current_sum = prefix[j];
                if (current_sum > max) {
                   max = current_sum;
                   
                }
            
            }
            
        }
        return max;
    }    
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        System.out.println("Maximum Sum SubArray is : " + sumPrefix(array));
    } }   
