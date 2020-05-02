
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads names and birth years from the user until an empty line is entered. 
        The name and birth year are separated by a comma.

        After that the program prints the longest name and the average of the birth years. 
        If multiple names are equally longest, you can print any of them.
        You can assume that the user enters at least one person.
         */
        String longest = "";
        
        int sum = 0;
        int counter = 0;
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {

                break;

            }
            
            String[] split = input.split(",");
            
            String name = split[0];
            int age = Integer.valueOf(split[1]);
            
            int lenght = name.length();

            if (lenght > longest.length()) {
                longest = name;

            }
            sum += age;

            counter++;

        }

        double average = (double) sum / counter;
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);

    }

}
