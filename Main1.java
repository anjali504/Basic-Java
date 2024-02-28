import java.io.*;



public class Main1{
    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Enter your operator");

        char op =sc.next().charAt(0);

        double o = 0;

        switch(op){

            case '+':
            o=a+b;
            break;
            case '-':
            o=a-b;
            break;
            case '*':
            o=a*b;
            break;
            case '/':
            o=a/b;
            break;
            default:
            System.out.println("you enter wrong number");

            System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(a+ " " + op + " " + b
                           + " = " + o);
    }
        }

        
    }