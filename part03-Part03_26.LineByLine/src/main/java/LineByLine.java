
import java.util.Scanner;

public class LineByLine {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Write a program that reads strings from the user. 
        If the input is empty, the program stops reading input and halts. 
        For each non-empty input it splits the string input by whitespaces and prints each part of the string on a new line.

         */
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;

            }

            stringSplit(input);
        }

    }

    public static void stringSplit(String string) {
        String[] split = string.split(" ");

        int index = 0;
        while (index < split.length) {
            System.out.println(split[index]);
            index++;

        }

    }

}
