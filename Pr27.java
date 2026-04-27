import java.io.*;
import java.util.*;

public class Pr27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                sc.nextLine();

                bw.write(roll + ", " + name + ", " + marks);
                bw.newLine();
            }

            System.out.println("\nStudent records written successfully.\n");

            bw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
                sc.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
/*Enter number of students: 2
Enter roll number: 1
Enter name: Rahul
Enter marks: 80
Enter roll number: 2
Enter name: Priya
Enter marks: 92

Student records written successfully.

Student Records:
1, Rahul, 80
2, Priya, 92
  */
