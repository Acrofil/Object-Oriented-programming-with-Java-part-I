
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads user input until an empty line is entered. 
        For each non-empty line the program splits the string by spaces and prints the first part of the string.
         */
        int index = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;

            }

            String[] split = input.split(" ");
            System.out.println(split[0]);
            index++;

        }

    }
}
