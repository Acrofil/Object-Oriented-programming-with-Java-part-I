
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        /*
        Expand the previous program so that the main program asks the user
        for the number of times the phrase will be printed 
        (i.e. how many times the method will be called).
         */
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        
        int askUser = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter != askUser) {
            printText();
            counter++;

        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}

