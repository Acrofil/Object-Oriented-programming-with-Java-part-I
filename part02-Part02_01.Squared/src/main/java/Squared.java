
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program that reads an integer from the user and prints the 
        square of the given integer, i.e. the integer multiplied by itself.
        */
        
        // Scanning the user input
        int integerInput = Integer.parseInt(scanner.nextLine());
        
        // Calculates the square of the user input
        int squareResult = integerInput * integerInput;
        
        // Prints the result
        System.out.println(squareResult);
        
        


    }
}
