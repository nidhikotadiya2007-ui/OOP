package student;

import java.util.Scanner;

public class Student {
    protected int rollNo;
    protected String name;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}



package exam;

import student.Student;
import java.util.Scanner;

public class Result extends Student {
    private int marks1, marks2, marks3;

    public Result() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        marks3 = sc.nextInt();
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}



package exam;

public class Pr19{
    public static void main(String[] args) {
        Result r = new Result();
        r.displayResult();
    }
}


//folder structure 
/*student/
    Student.java
exam/
    Result.java
    Main.java*/


  /*output 
  Enter Roll No: 101
Enter Name: Nidhi
Enter Marks 1: 85
Enter Marks 2: 90
Enter Marks 3: 88

Roll No: 101
Name: Nidhi
Marks 1: 85
Marks 2: 90
Marks 3: 88
Total: 263
Average: 87.66
  */
