
import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        The exercise template contains a program demonstrating the use of conditional statements. It is, however, incorrectly indented.

Try to run the tests before doing anything. TMC shows the indentation errors differently compared to errors in program logic.

When you notice how indentation errors are shown, correct them. Now would be a good time to give the automatic code formatting a try.
         */
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());

        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());

        if (first == second) {
            System.out.println("Same!");
        } else if (first > second) {
            System.out.println("The first was larger than the second!");
        } else {

            System.out.println("The second was larger than the first!");
        }

    }
}
