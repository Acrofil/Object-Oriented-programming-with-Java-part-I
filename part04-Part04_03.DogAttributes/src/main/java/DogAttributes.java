
import java.util.Scanner;

public class DogAttributes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Follow the instructions carefully
        // and run the tests.
        
        /*
        In this exercise, you'll practice creating a class.

        A new class can be added in NetBeans the following way: On the left side of the screen is the Projects list. 
        Right-click on the project's name, which for this exercise is Part04_03.DogAttributes. 
        From the drop-down menu, select New and Java Class. NetBeans will then ask for the class name.

        Name the class Dog in this exercise, and press the finish button.

        You have now created a class called Dog. 
        Add the variables private String name,private String breed and private int age to the class. 
        As a class diagram, the class looks like this:
        */
        
        Dog bucky = new Dog("Buck", "lab", 5);
        
        bucky.printDog();
    }
}
