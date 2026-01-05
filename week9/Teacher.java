package week9;


public class Teacher extends Person {
    private String subject;
    private double bonus;
    
    
    public Teacher(int id, String name, double basicSalary,String subject, double bonus) {
        super(id, name, basicSalary); 
        this.subject = subject;
        this.bonus = bonus;
    }
        public void displayPersonInfo() {
        super.displayPersonInfo(); 
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
        System.out.println("Annual Bonus: Rs" + bonus);
    }
    

    public double calculateAnnualSalary() {
        return super.calculateAnnualSalary() + bonus;
    }
}