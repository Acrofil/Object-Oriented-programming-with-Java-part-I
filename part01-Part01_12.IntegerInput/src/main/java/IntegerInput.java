
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*
      Give a number:
3
You gave the number 3
       */

        System.out.println("Give a number:");
        int value = Integer.parseInt(scanner.nextLine());
        System.out.println("You gave the number " + value);
    }
}
