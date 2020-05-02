
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Write a program that prompts the user for a year. 
        If the user inputs a number that is smaller than 2015, then the 
        program prints the string "Ancient history!".
        */
        
        System.out.println("Give a year:");
        int year = Integer.parseInt(scan.nextLine());
        
        if (year < 2015) {
            System.out.println("Ancient history!");
     
        }
    }
}
