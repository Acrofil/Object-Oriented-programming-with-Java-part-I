/*
In the exercise template there is a program that reads inputs from the user until an empty string is entered. 
Add the following functionality to it: after reading the inputs one more string is requested from the user. 
The program then tell whether that string was found in the list or not.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String userInput = scanner.nextLine();

        String found = null;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(userInput)) {

                found = userInput;

            }

        }

        if (!userInput.equals(found)) {
            System.out.println(userInput + " was not found!");
        } else {
            System.out.println(userInput + " was found!");
            
        }

    }
}
