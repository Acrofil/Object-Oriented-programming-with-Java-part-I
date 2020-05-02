
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*
        The table below describes how the grade for a particular course is determined. 
        Write a program that gives a course grade according to the provided table.
        points	grade
                < 0         impossible!
                0-49	failed
                 50-59	1
                60-69	2
                70-79	3
                80-89	4
                90-100	5
                > 100	incredible!
        
        */
        System.out.println("Give points [0-100]:");
        int points = Integer.parseInt(scan.nextLine());
        
        if (points < 0) {
            System.out.println(" Grade: impossible!");
            
        } else if (points <= 49) {
            System.out.println("failed");
            
        } else if (points >= 50 && points <= 59) {
            System.out.println("Grade: 1");
            
        } else if (points >= 60 && points <= 69) {
            System.out.println("Grade: 2");
            
        } else if (points >= 70 && points <= 79) {
            System.out.println("Grade: 3");
            
        } else if (points >= 80 && points <= 89) {
            System.out.println("Grade: 4");
            
        } else if (points >= 90 && points <= 100) {
            System.out.println("Grade 5");
            
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
