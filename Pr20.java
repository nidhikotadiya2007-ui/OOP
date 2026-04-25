import java.util.*;

class Pr20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        }

        catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }

        finally {
            System.out.println("Program execution completed.");
        }
    }
}

/*output :
Enter numerator: 10
Enter denominator: 2
Result: 5
Program execution completed.


Enter numerator: 10
Enter denominator: 0
Error: Cannot divide by zero.
Program execution completed.
  */
  
