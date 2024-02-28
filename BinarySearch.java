import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[] , int key){
        int start =0;
        int end=numbers.length-1;
        while (start<=end) { 
            int mid =  (start  + end )/2;    
            
            if (key == numbers[mid]){       // element is present at the middle itself        
                return mid;          
            }   
            if (key>numbers[mid]) {
                start = mid + 1;      // If key is greater than mid, ignore left half
            }
            else {                   // If key is smaller than mid, ignore right half
                end = mid - 1;
            } 
            } 
            return -1;
        }
        
                
    

            
        

    

    public static void main(String[] args) {
        int numbers[] = {1,4,8,7,55,4,6,5};
        int key = 1;

        System.out.println("your num at index " + binarySearch(numbers,key));
    }
}