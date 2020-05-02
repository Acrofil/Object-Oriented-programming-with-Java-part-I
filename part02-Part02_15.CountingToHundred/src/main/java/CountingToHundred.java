
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program, which reads an integer from the user. 
        Then the program prints numbers from that number to 100. 
        You can assume that the user always gives a number less than 100. 
        Below are some examples of the expected functionality.
        */
        
        int userInput = Integer.parseInt(scanner.nextLine()); // 10
        
       
        
        for (int i = userInput; userInput <= 100; userInput++) {
            
            System.out.println(userInput);
            
        }
        
        

    }
}
