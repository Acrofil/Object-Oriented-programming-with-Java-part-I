/*
The exercise template contains a base that reads numbers from the user and adds them to a list. 
Reading is stopped once the user enters the number -1.

Modify the program so that after reading the numbers it
calculates and prints the sum of the numbers in the list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            int number = list.get(i);
            sum += number;

        }
        System.out.println("Sum: " + sum);

    }
}
