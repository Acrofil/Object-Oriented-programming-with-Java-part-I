/*
Write a program that reads numbers from the user. When number 9999 is entered, 
the reading process stops. After this the program will print the smallest number in the list, 
and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 9999) {
                break;

            }

            list.add(input);

        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestNumber = list.get(0);
        int smallestNumberIndex = 0;
        for (int index = 0; index < list.size(); index++) {
            int number = list.get(index);

            if (smallestNumber > number) {
                smallestNumber = number;
                smallestNumberIndex = index;

            }

        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + smallestNumberIndex);

    }
}
