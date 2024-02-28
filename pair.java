import java.util.*;

public class pair{

    public static void Pair(int array[]){
        int total_pairs = 0;
        int n = array.length;
        for(int i =0; i < n; i++){
            int cur =  array[i];
            for(int j =  i+1 ;j<n; j++) {
                System.out.print("("+ cur + "," +array[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are : "+total_pairs);
    }
    public static void main(String[] args) {
        int array[]={1,2,3};
        Pair(array);
    }    
}