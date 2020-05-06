
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        Scanner scanner = new Scanner(System.in);

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        while (true) {

            System.out.println("First name: ");
            String inputFirstName = scanner.nextLine();

            if (inputFirstName.isEmpty()) {
                break;

            }

            System.out.println("Last name: ");
            String inputLastName = scanner.nextLine();

            System.out.println("Identification number: ");
            String inputId = scanner.nextLine();

            infoCollection.add(new PersonalInformation(inputFirstName, inputLastName, inputId));

        }

        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
