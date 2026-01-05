package week9;



    public class ContractEmployee extends Employee {
    
    private int workingDays;
    

    public ContractEmployee(int employeeId, String name, double basicSalary,
                           int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }
    
    public void displayEmployee() {
        super.displayEmployee(); 
        System.out.println("Working Days: " + workingDays);
    }
    
    
    public double calculateTotalSalary() {
        return basicSalary * workingDays;
    }
}

