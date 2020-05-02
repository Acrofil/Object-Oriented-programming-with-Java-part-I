
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program that reads numbers from the user until the user inputs a number 0. 
        After this the program outputs the sum of the numbers. 
        The number zero does not need to be added to the sum, even if it does not change the results.
        */
        
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");    
            int numberInput = Integer.parseInt(scanner.nextLine());
            
            if (numberInput == 0) {
                break;
                
            } 
            
            sum += numberInput;
            
        }
        
        System.out.println("Sum of the numbers: " + sum);

    }
}
