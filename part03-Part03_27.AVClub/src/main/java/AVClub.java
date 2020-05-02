
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads user input until an empty line. 
        For each non-empty string, the program splits the string
        by spaces and then prints the pieces that contain av, each on a new line.
         */
        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;

            }
            stringSplit(userInput);

        }

    }

    public static void stringSplit(String string) {
        String[] split = string.split(" ");

        int index = 0;
        while (index < split.length) {

            if (split[index].contains("av")) {
                String itHasAv = split[index];
                System.out.println(itHasAv);

            }
            index++;

        }

    }
}
