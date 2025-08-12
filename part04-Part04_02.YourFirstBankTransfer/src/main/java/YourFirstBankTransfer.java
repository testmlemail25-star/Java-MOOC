
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Create Matthew's account with balance 100
        Account matthewsAccount = new Account("Matthews account", 1000);
        // Create my account with balance 0
        Account myAccount = new Account("My account", 0);
        // Withdraw 100 from Matthew's account
        matthewsAccount.withdrawal(100);
        // Lodge 100 into my account
        myAccount.deposit(100);
        // Print the balance of both accounts
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
        
        
    }
}
