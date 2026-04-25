import java.util.Scanner;

class Pr21{
  
    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            System.out.println("Validation process completed");
            sc.close();
        }
    }
}
/*output:
Enter age: 16
Exception: Age must be 18 or above to vote
Validation process completed

Enter age: 20
Eligible to vote
Validation process completed
  */
