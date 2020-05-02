
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program, according to the preceding example, 
        that asks the user to input values until they input the value 4.
         */
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 4) {
                break;

            }
        }

    }
}
