
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Write a method public static void divisibleByThreeInRange(int beginning, int end) 
        that prints all the numbers divisible by three in the given range. 
        The numbers are to be printed in order from the smallest to the greatest.
         */
        divisibleByThreeInRange(3, 6);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        
        for (int i = beginning; beginning <= end; beginning++) {

            if (beginning % 3 == 0) {
                System.out.println(beginning);

            }

        }

    }

}
