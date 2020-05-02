
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads names and ages from the user until an empty line is entered. 
        The name and age are separated by a comma.

        After reading all user input, the program prints the age of the oldest person. 
        You can assume that the user enters at least one person, and that one of the users is older than the others.
         */
        int oldest = 0;
        int age = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;

            }

            String[] split = input.split(","); // split string
            age = Integer.valueOf(split[1]); // convert string to int age

            if (age > oldest) { // check age
                oldest = age;

            }

        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
