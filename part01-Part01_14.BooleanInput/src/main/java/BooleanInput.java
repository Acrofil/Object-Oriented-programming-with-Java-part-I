
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write something:
santa does not exist
True or false? false
         */

        System.out.println("Write something:");
        boolean value = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + value);

    }
}
