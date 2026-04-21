import java.util.*;

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name: ");
            studentName = sc.nextLine();
            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Pr11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter college name: ");
        String collegeName = sc.nextLine();

        College college = new College(collegeName);
        College.Admission admission = college.new Admission();

        admission.acceptDetails();
        admission.displayDetails();
    }
}
/*output:
Enter college name: GTU 
Enter student name: Riya Sharma
Enter course: BE

--- Admission Details ---
College Name: GTU
Student Name: Riya Sharma
Course: BE*/
