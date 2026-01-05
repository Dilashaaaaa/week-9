package week9;


public class PermanentEmployee extends Employee {
    
    private double houseRentAllowance;
    private double dearnessAllowance;
    
    public PermanentEmployee(int employeeId, String name, double basicSalary,
                            double houseRentAllowance, double dearnessAllowance) {
        super(employeeId, name, basicSalary); 
        this.houseRentAllowance = houseRentAllowance;
        this.dearnessAllowance = dearnessAllowance;
    }
    
    public void displayEmployee() {
        super.displayEmployee(); 
        System.out.println("House Rent Allowance: Rs" + houseRentAllowance);
        System.out.println("Dearness Allowance : Rs" + dearnessAllowance);
    }
    
    
    public double calculateTotalSalary() {
        double bonus = super.calculateBonus(); 
        return basicSalary + houseRentAllowance + dearnessAllowance + bonus;
    }
}
    
