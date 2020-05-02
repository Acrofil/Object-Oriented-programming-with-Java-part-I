
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Give the first number:
5
Give the second number:
4
5 + 4 = 9
         */
        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }
}
