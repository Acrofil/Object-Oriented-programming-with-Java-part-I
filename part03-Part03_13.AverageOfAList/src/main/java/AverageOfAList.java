/*
The exercise template contains a base that reads numbers from the user and adds them to a list. 
Reading is stopped once the user enters the number -1.

Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                break;

            }

            numbers.add(input);

        }
        int i = 0;
        int sum = 0;

        for (i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            sum += number;

        }
        double average = (double) sum / i;
        System.out.println("Average: " + average);

    }
}
