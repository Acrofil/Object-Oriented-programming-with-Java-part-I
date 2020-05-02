
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program that asks the user for input until the user inputs 0. 
        After this the program prints the amount of numbers inputted and the sum of the numbers. 
        The number zero does not need to be added to the sum, but adding it does not change the results.
        You need two variables to keep track of the information. Use one for keeping track of the numbers inputted and other for keeping track of the sum
        */
        
        int numbersCount = 0;
        int numbersSum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput == 0) {
                break;
                
            } 
            
            numbersCount++;
            numbersSum += numberInput;
            
           
        }
        
        System.out.println("Number of numbers: " + numbersCount);
        System.out.println("Sum of the numbers: " + numbersSum );

    }
}
