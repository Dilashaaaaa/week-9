package week9;


public class SchoolApp {
    public static void main(String[] args) {
        System.out.println("Institution: " + Person.collegeName);
        Teacher teacher1 = new Teacher(101, "Sofiya", 4500.0, "Mathematics", 5000.0);
        teacher1.displayPersonInfo();
        System.out.println("Annual Salary: Rs" + teacher1.calculateAnnualSalary());
        Staff staff1 = new Staff(201, "Sushov", 1500.0, 160, 15.0);
        staff1.displayPersonInfo();
        System.out.println("Monthly Salary (based on hours): Rs" + staff1.calculateSalary());
        System.out.println(teacher1.name + " (Teacher) - Annual: Rs" + teacher1.calculateAnnualSalary());
        System.out.println(staff1.name + " (Staff) - Monthly: Rs" + staff1.calculateSalary());
    
    }
}