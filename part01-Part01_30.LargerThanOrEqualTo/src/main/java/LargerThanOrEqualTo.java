
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
        Write a program that prompts the user for two integers and prints the larger of the two. 
        If the numbers are the same, then the program informs us about this as well.
        */
        /*
        Give the first number:
5
Give the second number:
3
Greater number is: 5
        */
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scan.nextLine());
        
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scan.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater number is: " + firstNumber);
          
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number is: " + secondNumber);
            
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
            
        }

    }
}
