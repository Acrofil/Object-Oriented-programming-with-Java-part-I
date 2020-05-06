
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
         try  (Scanner scann = new Scanner(Paths.get("data.txt"))) {
             
             while (scann.hasNextLine()) {    
                 
                 String line = scann.nextLine();
                 
                 System.out.println(line);
                 
             }
             
             
            
        } catch (Exception e) {
            
             System.out.println("Error: " + e.getMessage());
        }
             
    }
}
