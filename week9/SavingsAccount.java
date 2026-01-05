package week9;


public class SavingsAccount extends BankAccount {
    
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    
    
    public void displayAccountInfo() {
        super.displayAccountInfo(); 
        System.out.println("Account Type: Savings Account");
    }
    
    
    public double calculateInterest() {
        double interest = super.getBalance() * interestRate / 100;
        return interest;
    }
    

    public void applyInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest Applied: Rs" + interest);
        System.out.println("New Balance: Rs" + balance);
    }
}
