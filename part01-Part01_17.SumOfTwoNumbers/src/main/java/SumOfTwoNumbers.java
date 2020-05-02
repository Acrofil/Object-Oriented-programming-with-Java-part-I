
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Here's how the program is expected to work:

Sample output
Give the first number:
8
Give the second number:
3
The sum of the numbers is 11
         */

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (number1 + number2));

    }
}
