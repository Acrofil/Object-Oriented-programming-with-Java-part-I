
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        
       Write a program that recognizes the following users:
         */

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userName.equals("alex") && password.equals("sunshine") || userName.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");

        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
