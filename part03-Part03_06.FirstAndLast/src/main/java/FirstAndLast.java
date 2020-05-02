/*
In the exercise template there is a program that reads inputs from the user 
and adds them to a list. Reading is stopped once the user enters an empty string.

Modify the program to print both the first and the last values after the reading ends. 
You may suppose that at least two values are read into the list.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

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
        
        int indexEnd = list.size() - 1;
        int indexStart = list.size() - list.size();
        System.out.println(list.get(indexStart));
        System.out.println(list.get(indexEnd));

    }
}
