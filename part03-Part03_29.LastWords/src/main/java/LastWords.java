
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a program that reads user input until an empty line is entered.
        For each non-empty line the program splits the string by spaces and prints the last part of the string.
        */
        
        int index = 0;
        
        while (true) {
            String inputString = scanner.nextLine();
            
            if (inputString.equals("")) {
                break;
                
            }
            String[] split = inputString.split(" "); // splits each word
            int lastWordIndex = split.length - 1; // finding last word index
            System.out.println(split[lastWordIndex]); // printing last word
            
            index++;
            
        }


    }
}
