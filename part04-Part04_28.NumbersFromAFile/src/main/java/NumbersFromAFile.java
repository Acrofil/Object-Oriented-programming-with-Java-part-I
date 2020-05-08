
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();

        try (Scanner scann = new Scanner(Paths.get(file))) {

            while (scann.hasNextLine()) {
                String searchNumbers = scann.nextLine();
                int convert = Integer.valueOf(searchNumbers);

                numbers.add(convert);

            }

        } catch (Exception e) {
            System.out.println("No file found");
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        int totalNumbers = 0;
        while (count < numbers.size()) {

            int number = 0;
            if (numbers.get(count) >= lowerBound && numbers.get(count) <= upperBound) {
                number++;
                totalNumbers += number;

            }

            count++;

        }

        System.out.println("Numbers: " + totalNumbers);

    }

}
