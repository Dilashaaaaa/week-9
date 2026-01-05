package week9;


   
 public class Payroll {
   
     public static void main(String[] args) {
    
        PermanentEmployee permEmp = new PermanentEmployee(1001, "pareena", 5000.0, 1500.0, 1000.0);
        ContractEmployee contractEmp = new ContractEmployee(2001, "modit", 200.0, 22);
        permEmp.displayEmployee();
        System.out.println("Bonus: Rs" + permEmp.calculateBonus());
        System.out.println("Total Salary: Rs" + permEmp.calculateTotalSalary());
        contractEmp.displayEmployee();
        System.out.println("Total Salary: Rs" + contractEmp.calculateTotalSalary());
        
}
}