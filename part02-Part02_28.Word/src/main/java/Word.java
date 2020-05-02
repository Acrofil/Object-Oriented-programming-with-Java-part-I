
import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*
        Write a method public static String word(). 
        The method must return a string of your choice
        */
        // The value of the method is passed to the String variable
        String stringMethod = word();
        // prints the value of the method "word"
        System.out.println(stringMethod);

    }
    public static String word() {
    
        return "Hello, from the method world!";
    }

}
