
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads values from the user until they input a 0. 
        After this, the program prints the total number of inputted values. 
        The zero that's used to exit the loop should not be included in the total number count.
         */
        int count = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput == 0) {
                break;

            }
            
            count++;
        }

        System.out.println("Number of numbers: " + count);

    }
}
