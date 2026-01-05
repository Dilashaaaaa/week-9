package week9;


public class BankApp {
    public static void main(String[] args) {
    
        SavingsAccount savingsAcc = new SavingsAccount("SAV-10001", "Dilasha", 10000.0, 5.5);
        
        CurrentAccount currentAcc = new CurrentAccount("CUR-20001", "Doma", 5000.0, 2000.0);
        
        savingsAcc.displayAccountInfo();
        savingsAcc.deposit(2000.0);
        System.out.println("Interest Amount: Rs" + savingsAcc.calculateInterest());
        savingsAcc.applyInterest();
        System.out.println("Current Balance: Rs" + savingsAcc.getBalance());
        currentAcc.displayAccountInfo();
        currentAcc.deposit(3000.0);
        currentAcc.withdraw(6000.0);
        currentAcc.withdraw(3000.0);
        currentAcc.withdraw(2500.0);
        System.out.println("Final Balance: Rs" + currentAcc.getBalance());
    }}