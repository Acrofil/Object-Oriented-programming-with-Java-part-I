
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Give a number:
3.14
You gave the number 3.14
         */

        System.out.println("Give a number:");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("You gave the number " + value);

    }
}
