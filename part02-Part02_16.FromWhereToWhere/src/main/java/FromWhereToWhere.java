
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Part 1 & 2
        Write a program which prints the 
        integers from 1 to a number given by the user.
        */
        
        System.out.println("Where to?");
        int userInput = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Where from?");
        int userInputTwo = Integer.parseInt(scanner.nextLine());
      
        for (int i = userInputTwo; userInputTwo <= userInput; userInputTwo++) {
            System.out.println(userInputTwo);
            
        }
    }
}
