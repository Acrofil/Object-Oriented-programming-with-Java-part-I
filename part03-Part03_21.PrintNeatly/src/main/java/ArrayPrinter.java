
import java.util.Arrays;

/*
Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' 
to make it print the numbers of the array it receives more neatly. 
There should be a whitespace and a comma between each number. don't put a comma after the last number.

Print the numbers on one line using System.out.print.
*/
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        
        String sep = "";
        int index = 0;
        while (index < array.length) {
            int number = array[index];
            
            System.out.print(sep + number);
            sep = ", ";
            index++;
            
            
        }
        
        
        
        
    }
}
