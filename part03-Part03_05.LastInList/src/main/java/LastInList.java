/*
In the exercise template there is a program that reads inputs from the user 
and adds them to a list. Reading is stopped once the user enters an empty string.

Your task is to modify the method to print the last read value after it stops reading. 
\Print the value that was read last from the list. Use the method that tells the size of a list to help you.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        int lastIndex = list.size() - 1; // total size - 1 is the index of the last input
        System.out.println(list.get(lastIndex)); 

    }
}
