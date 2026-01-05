package week9;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount {
        private double overdraftLimit;
    
    
    public CurrentAccount(String accountNumber, String accountHolderName,double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public void displayAccountInfo() {
        super.displayAccountInfo(); 
        System.out.println("Account Type: Current Account");
        System.out.println("Overdraft Limit: Rs" + overdraftLimit);
    }
    
    public boolean withdraw(double amount) {
            
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal Successful: Rs" + amount);
            System.out.println("New Balance: Rs" + balance);
            return true;
        } else {
            System.out.println("Withdrawal Failed! Insufficient funds.");
            return false;
        }
    }
}
