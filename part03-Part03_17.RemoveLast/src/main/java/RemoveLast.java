/*
Create the method public static void removeLast(ArrayList<String> strings) in the exercise template. 
The method should remove the last value in the list it receives as a parameter. 
If the list is empty, the method does nothing.
 */
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First"); // 0
        strings.add("Second"); // 1
        strings.add("Third"); // 2

        System.out.println(strings);

        

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

    }

    public static void removeLast(ArrayList<String> strings) {

        if (strings.isEmpty()) {
            return;

        }
        
        strings.remove(strings.size() - 1); // removing last  
        /*int last = strings.size() - 1;
        for (int i = last; last > 0; last--) {

            strings.remove(i);
            break;

        }*/

    }

}
