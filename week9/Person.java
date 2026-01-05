package week9;



public class Person {

    protected int id;
    protected String name;
    protected double basicSalary;
    static String collegeName = "Islington College";
    
    
    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    

    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
    
    
    public void displayPersonInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: Rs" + basicSalary);
        System.out.println("College: " + collegeName);
    }
}