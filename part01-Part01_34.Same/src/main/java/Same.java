
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Write a program that prompts the user for two strings. 
        If the strings are the same, then the program prints "Same". 
        Otherwise, it prints "Different".
        */ 
        
        System.out.println("Enter the first string:");
        String string1 = scan.nextLine();
        
        System.out.println("Enter the second string:");
        String string2 = scan.nextLine();
        
        if (string1.equals(string2)) {
            System.out.println("Same");
            
        } else {
            System.out.println("Different");
        }
    }
}
