
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program by using the loop example that asks
        "Carry on?" until the user inputs the string "no".
         */
        
        String input;

        while (true) {
            System.out.println("Carry on?");
            input = scanner.nextLine();

            if (input.equals("no")) {
                break;

            }

        }

    }
}
