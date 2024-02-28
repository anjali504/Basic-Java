import java.util.*;

public class subArray {

    public static void sArray(int array[]) {
        int n = array.length;
        int ts = 0;
        int max =  Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("  " + array[k]);
                    total += array[k];
                    if(total> max){
                        max=total;
                    }
                    if(total< min){
                        min=total;
                    }
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
        System.out.println("Maximum sum of any subarray is: "+max);
        System.out.println("Minimum sum of any subarray is: "+min);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        System.out.println("Subsets of the given set are: ");
        sArray(array);
    }
}
