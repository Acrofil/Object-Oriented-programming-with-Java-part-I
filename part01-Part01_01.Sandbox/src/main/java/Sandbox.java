
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
            // 1. Printing the time
            if (hours < 10) {
                System.out.print("0");
            }
            System.out.print(hours);

            System.out.print(":");

            if (minutes < 10) {
                System.out.print("0");
            }
            System.out.print(minutes);

            System.out.print(":");

            if (seconds < 10) {
                System.out.print("0");
            }
            System.out.print(seconds);
            System.out.println();

            // 2. The second hand's progress
            seconds = seconds + 1;

            // 3. The other hand's progress when necessary
            if (seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;

                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;

                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }

}
