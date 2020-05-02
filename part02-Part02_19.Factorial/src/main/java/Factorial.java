
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Implement a program which calculates the factorial of a number given by the user.

        Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. 
        For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. 
        Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.
         */
        
        System.out.println("Give a number: ");
        int numberInput = Integer.parseInt(scanner.nextLine());

        long factorial = 1;
        int i = 1;

        for (i = 1; i <= numberInput; i++) { 

            factorial *= i;

        }
        System.out.println("Factorial: " + factorial);

    }
}
