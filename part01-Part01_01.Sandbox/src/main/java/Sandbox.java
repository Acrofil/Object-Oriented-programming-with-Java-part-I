
import java.util.Scanner;
import org.w3c.dom.events.MutationEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class Sandbox {

    public static void main(String[] args) {
        /*  Scanner scan = new Scanner(System.in);

        ArrayList<String> studentsName = new ArrayList<>();
        ArrayList<Integer> studentGrade = new ArrayList<>();
        String students;
        int studentGradeValue = 0;

        while (true) {
            System.out.println("Write student name: ");
            students = scan.nextLine();
            studentsName.add(students);
            System.out.println("Write Student grade: ");
            studentGradeValue = Integer.parseInt(scan.nextLine());
            studentGrade.add(studentGradeValue);

            if (students.equals("") && studentGradeValue == 0) {
                break;

            }

        }

        studentsName.size();
        int test = 0;
        while (studentsName.size() > test) {
            System.out.print("Student name: " + studentsName.get(test) + " - grade: " + studentGrade.get(test));
            System.out.println("");
            test++;

        }
        while (true) {

            System.out.println("Which specific student would you like to see now? Type number.");
            int specificStudent = Integer.parseInt(scan.nextLine());
            if (specificStudent == -1) {
                break;

            }
            if (studentGrade.get(specificStudent) >= 3) {
                System.out.print(studentsName.get(specificStudent - 1) + " " + studentGrade.get(specificStudent - 1) + " Succed!\n");

            } else if (studentGrade.get(specificStudent) < 3) {
                {
                    System.out.print(studentsName.get(specificStudent - 1) + " " + studentGrade.get(specificStudent - 1) + " Fail!\n");

                }*/

        // Which of the following snippets of code swaps the values at indices 0 and 1 (the value originally at index 0 is now at index 1, and vice versa)?
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count = count + 1;
        }

        if (count > 0) {
            System.out.println("Age average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }

    }

}
