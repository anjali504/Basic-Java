import java.util.*;

public class bubblesort {

    public static void bubble(int[] array){ // Corrected parameter type
        for(int i=0 ; i<array.length-1;i++){
            for(int j=0; j<array.length-1-i;j++){
                if(array[j]>array[j+1]){ // Corrected typo "arry" to "array"
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            
            }
           
        }
    }

    public static void main(String[] args) {
        int array[] = {5,58,89,34,45};
        bubble(array); // Call the bubble method to sort the array
       
    }
}
