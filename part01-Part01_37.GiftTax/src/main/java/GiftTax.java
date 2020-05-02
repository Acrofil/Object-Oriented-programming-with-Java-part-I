
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        A gift is a transfer of property to another person against no compensation or payment. 
        If the total value of the gifts you receive from the same donor in the course of 3 years is €5,000 or more, you must pay gift tax.

            When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source vero.fi):
        
                 Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
                    5 000 — 25 000	100	8
                    25 000 — 55 000	 1 700	10
                    55 000 — 200 000	4 700	12
                    200 000 — 1 000 000	22 100	15
                    1 000 000 —	142 100	17
                     */
        
        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scan.nextLine());
        
        if (gift < 5000) {
            System.out.println("No tax!");
            
        } else if (gift >= 5000 && gift <= 25_000) {
            double tax = (100 + (gift - 5000) * 0.08);
            System.out.println("tax: " + tax);
            
        } else if (gift >= 25_000 && gift <= 55_000) {
            double tax2 = (1700 + (gift - 25_000) * 0.10);
            System.out.println("Tax: " + tax2);
            
        } else if (gift >= 55_000 && gift <= 200_000) {
            double tax3 = (4700 + (gift - 55_000)* 0.12);
            System.out.println("Tax: " + tax3);
            
        } else if (gift >= 200_000 && gift <= 1_000_000) {
            double tax4 = (22100 + (gift - 200_000) * 0.15);
            System.out.println("Tax: " + tax4);
            
        } else if (gift > 1_000_000) {
            double tax5 = (142_100 + (gift - 1_000_000) * 0.17);
            System.out.println("Tax: " + tax5);
            
        }

    }
}
