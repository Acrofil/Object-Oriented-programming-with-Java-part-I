
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("Title: ");
            String inputTitle = scan.nextLine();

            if (inputTitle.isEmpty()) {
                break;

            }

            System.out.println("Pages: ");
            int inputPages = Integer.parseInt(scan.nextLine());

            System.out.println("Publication year: ");
            int inputYear = Integer.parseInt(scan.nextLine());

            books.add(new Book(inputTitle, inputPages, inputYear));

        }

        System.out.println("What information will be printed?");
        String input = scan.nextLine();

        if (input.equals("everything")) {

            for (Book book : books) {
                System.out.println(book);
            }

        } else if (input.equals("name")) {

            for (Book book : books) {
                System.out.println(book.getName());
            }

        }

    }
}
