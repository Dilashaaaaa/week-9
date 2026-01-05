package week9;


public class BankAccount {
    
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    
    
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        this.balance=this.balance+amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
    }
}

