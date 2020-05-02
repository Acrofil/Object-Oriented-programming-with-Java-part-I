
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Give the first number:
8
Give the second number:
2
8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0
         */

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        int addition = number1 + number2;
        int sub = number1 - number2;
        int multiply = number1 * number2;
        double division = (double) number1 / number2;
        

        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + sub);
        System.out.println(number1 + " * " + number2 + " = " + multiply);
        System.out.println(number1 + " / " + number2 + " = " + division);



    }
}
