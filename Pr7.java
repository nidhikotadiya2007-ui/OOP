import java.util.*;

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }
  
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}
public class Pr7 {
    public static void main(String[] args) {
        Employee emp = new Employee();  

        emp.readEmployeeData();         
        emp.displayEmployeeData();      
    }
}
/*output:
Enter Employee Name: John Doe
Enter Employee Salary: 50000

Employee Details:
Name: John Doe
Salary: 50000.0
  */
