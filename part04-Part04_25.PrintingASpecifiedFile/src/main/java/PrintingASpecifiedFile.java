
import java.nio.file.Paths;

import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String userInput = scanner.nextLine();

        try (Scanner scann = new Scanner(Paths.get(userInput))) {

            while (scann.hasNextLine()) {

                String line = scann.nextLine();
                System.out.println(line);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}
