
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        while (true) {

            System.out.println("Name: ");
            String inputProgram = scanner.nextLine();

            if (inputProgram.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int inputDuration = Integer.parseInt(scanner.nextLine());

            programs.add(new TelevisionProgram(inputProgram, inputDuration));

        }

        System.out.println("Program's maximum duration?");
        int inputMax = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {

            if (program.getDuration() <= inputMax) {
                System.out.println(program);

            }

        }

    }
}
