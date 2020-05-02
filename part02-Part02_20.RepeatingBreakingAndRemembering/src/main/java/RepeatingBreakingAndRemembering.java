
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        /*                             PART 1
        Implement a program that asks the user for numbers (the program first prints "Write numbers: ") 
        until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.
         */
 /*                             PART 2
        Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
         */
 /*                             PART 3
        Extend the program so that it also prints the number of numbers (not including the -1) the user has written.
         */
 /*                             PART 4
        Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
         */
 /*                             PART 5
        Extend the program so that it prints the number of even and odd numbers (excluding the -1).
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int countNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == -1) {
                break;

            }

            if (userInput % 2 == 0) {
                evenNumbers++;

            } else {
                oddNumbers++;
            }

            sum += userInput;
            countNumbers++;

        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countNumbers);
        System.out.println("Average: " + ((double) sum / countNumbers));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);

    }
}
