
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        /*
        Creates an account named "Matthews account" with the balance 1000
        Creates an account named "My account" with the balance 0
        Withdraws 100.0 from Matthew's account
        Deposits 100.0 to "my account"
        Prints both the accounts
        */
        
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0);
        
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        
        
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        
    }
}
