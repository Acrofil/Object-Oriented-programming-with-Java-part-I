
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        The exercise contains a base that asks the user for strings and adds them to a list. 
        The program stops reading when the user enters an empty string. The program then prints the first element of the list.

        Your assignment is to modify the program so that instead of the first value, the third value on the list is printed. 
        Remember that programmers start counting from zero! 
        The program is allowed to malfunction if there are fewer than three entries on the list, 
        so you don't need to prepare for such an event at all.
        */

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
           
            list.add(input);
        }

        System.out.println(list.get(2));
    }
}
