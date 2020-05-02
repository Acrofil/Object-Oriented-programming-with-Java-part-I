
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Give a string:
bye-bye
Give an integer:
11
Give a double:
4.2
Give a boolean:
true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true
         */

        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int intValue = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double doubleValue = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);

    }
}
