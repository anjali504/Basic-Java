import java.util.*;

public class Array {
   
    public static int LinearSearch(String menu[], String key) {
        for(int i = 0; i < menu.length; i++) {
            if(menu[i].equals(key)) {
                return i;
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you want in your menu:");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        String menu[] = new String[numItems];
        System.out.println("Please enter item names one by one:");
        for(int i = 0; i < numItems; i++) {
            menu[i] = scanner.nextLine();
        }
        
        // Printing the menu items
        System.out.println("Menu items:");
        for(int i = 0; i < numItems; i++) {
            System.out.println(menu[i]);
        }

        System.out.println("Enter the item you want to search:");
        String key = scanner.nextLine();

        int index = LinearSearch(menu, key);
        if (index ==  -1) {
            System.out.println("Item was not found.");
        } else {
            System.out.println("Item " + key + " is at index " + index);
        }
}}
