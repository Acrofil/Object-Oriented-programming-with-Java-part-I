
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program, that reads an integer from the user. 
        If the number is less than 0, the program prints the given 
        integer multiplied by -1. In all other cases, the program prints the number itself. 
        A few examples of how the program's expected to funciton are shown below:
        */
        
        int number = Integer.parseInt(scanner.nextLine());
        
        if (number < 0) {
            int multiply = number * -1;
            System.out.println(multiply);
           
        } else {
            System.out.println(number);
        }

    }
}
