
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a program that asks the user for input until the user inputs 0. 
        After this, the program prints the average of the positive numbers (numbers that are greater than zero).
        If no positive number is inputted, the program prints "Cannot calculate the average"
         */
        
        int positives = 0;
        int count = 0;

        while (true) {

            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput == 0) {
                break;

            } else if (numberInput > 0) {
                count++;
                positives += numberInput;

            }

        }

        if (positives == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            double average = (double) positives / count;
            System.out.println(average);
        }

    }
}
