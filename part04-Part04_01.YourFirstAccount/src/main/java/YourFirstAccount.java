
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

         /*Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Intial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdrawal(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);*/
 /*
       Write a program that creates an account with a balance of 100.0, 
       deposits 20.0 in it, and finally prints the balance. NB! Perform all the operations in this exact order.
         */
        Account atanasAccount = new Account("Atanas account", 100.0);
        
       
        
        
        System.out.println("The balance of Atanas's account is now: " + atanasAccount);
        atanasAccount.deposit(20.0);

        System.out.println("The balance of Atanas account is: " + atanasAccount);
    }
}
