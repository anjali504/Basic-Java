import java.util.*;

public class selctionSort {

    public static void selction(int a[]){
        // selection sort
        for(int i = 0; i <= a.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[minPos]){
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 55, 7, 86, 7};
        selction(a);
        print(a);
    }
}
