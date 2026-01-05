class PermanentEmployee extends Employee {
    // Additional attributes
    private double houseRentAllowance;
    private double dearnessAllowance;
    
    // Constructor with super() for constructor chaining
    public PermanentEmployee(int employeeId, String name, double basicSalary,
                            double houseRentAllowance, double dearnessAllowance) {
        super(employeeId, name, basicSalary); // Call parent constructor
        this.houseRentAllowance = houseRentAllowance;
        this.dearnessAllowance = dearnessAllowance;
    }
    
    // Override displayEmployee to include permanent employee details
    @Override
    public void displayEmployee() {
        super.displayEmployee(); // Call parent method
        System.out.println("House Rent Allowance (HRA): $" + houseRentAllowance);
        System.out.println("Dearness Allowance (DA): $" + dearnessAllowance);
    }
    
    // Method to calculate total salary
    public double calculateTotalSalary() {
        double bonus = super.calculateBonus(); // Use parent method
        return basicSalary + houseRentAllowance + dearnessAllowance + bonus;
    }
}
