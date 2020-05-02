
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Implement a program, which calculates the sum 1+2+3+...+n 
        where n is given as user input.
        And this one calculated 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
         */
        System.out.println("Last number?");
        int userInput = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int i = 0;
        

        for (i = 0; i <= userInput; i++) {

            sum += i; // sum + i  sum = 1 + 2 // sum = 2 + 3... sum = 3 + 4

        }

        System.out.println("The sum is " + sum);

    }
}
