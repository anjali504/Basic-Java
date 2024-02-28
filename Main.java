import java.util.*;

public class Main{

    /**
     * @param args
     */
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("A is greater than b");
        }

        else if(a == b){
            System.out.println("Both the values are same");
        }

        else{
            System.out.println("B is greater than A");
        }


    }
}