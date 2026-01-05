package week9;



public class Staff extends Person {
    
    private int workingHours;
    private double ratePerHour;
    
    
    public Staff(int id, String name, double basicSalary, int workingHours, double ratePerHour) {
        super(id, name, basicSalary); 
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Role: Staff");
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Rate Per Hour: Rs" + ratePerHour);
    }
    
    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}