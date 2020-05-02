
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that reads values from the user until they input a 0. 
        After this, the program prints the total number of inputted values that are negative. 
        The zero that's used to exit the loop should not be included in the total number count.
         */
        
        int zeroValues = 0;

        while (true) {
            System.out.println("Give a number:");
            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput == 0) {
                break;

            } else if (numberInput < 0) {
                zeroValues++;

            }

        }

        System.out.println("Number of negative numbers: " + zeroValues);

    }
}
