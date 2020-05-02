
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads names and ages from the user until an empty line is entered. 
        The name and age are separed by a comma.

        After reading all user input, the program prints the name of the oldest person. 
        You can assume that the user enters at least one person, and the that one of the users is older than the others.
         */
        int oldest = 0;
        int age = 0;
        
        String nameOldest = null;
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;

            }

            String[] split = input.split(","); // split string
            age = Integer.valueOf(split[1]); // convert string to int age
            

            if (age > oldest) { // check age
                oldest = age;
                nameOldest = split[0];
                
            }
            
            

        }
        System.out.println("Name of the oldest: " + nameOldest);

    }
}
