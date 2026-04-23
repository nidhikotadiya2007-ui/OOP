import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

public class Pr15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String ename = sc.nextLine();
        System.out.println("Enter Employee Department:");
        String edept = sc.nextLine();

        System.out.println("Enter Manager Name:");
        String mname = sc.nextLine();
        System.out.println("Enter Manager Department:");
        String mdept = sc.nextLine();
        System.out.println("Enter Team Size:");
        int teamSize = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Project Name:");
        String project = sc.nextLine();

        Employee e = new Employee(ename, edept);
        Employee m = new Manager(mname, mdept, teamSize, project);

        System.out.println("\nEmployee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();
    }
}
/*output:
Enter Employee Name:
Rahul
Enter Employee Department:
HR
Enter Manager Name:
Sneha
Enter Manager Department:
IT
Enter Team Size:
5
Enter Project Name:
AI System

Employee Details:
Employee Name: Rahul
Department: HR

Manager Details:
Manager Name: Sneha
Department: IT
Team Size: 5
Project: AI System
  */
