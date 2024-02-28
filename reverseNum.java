import java .util.*;
public class reverseNum {
    public static void reverseArray(int array[],int numbers[]){
        int start = 0;
        int end = array.length -1 ;
         while (start < end) {
             // swap elements at start and end
              int temp = array[start];
              array[start] = array[end];
              array[end] = temp;
               start++;
                end--;
            }
           
    }
    
    public static void main(String[] args) {
        int array[] ={1,2,23,5};
        int numbers[] ={1,2,3,4,5,6,7,8};
         reverseArray(array,numbers);
        System.out.println("Reversed Array is : ");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
            
        }
    }

