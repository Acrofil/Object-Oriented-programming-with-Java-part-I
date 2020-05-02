
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Give the first number:
8
Give the second number:
2
The average is 5.0
         */

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        double average = (double) (number1 + number2) / 2;

        System.out.println("The average is " + average);

    }
}
