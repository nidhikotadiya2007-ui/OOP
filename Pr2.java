import java.util.Scanner;

public class Pr2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.print("Enter d: ");
        double d = sc.nextDouble();

        System.out.print("Enter e: ");
        double e = sc.nextDouble();

        System.out.print("Enter f: ");
        double f = sc.nextDouble();
      
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("No unique solution exists (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;
          
            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }
    }
}
/*output:
Enter a: 2
Enter b: 3
Enter c: 1
Enter d: 2
Enter e: 5
Enter f: 4

Value of x = 2.00
Value of y = 1.00
*/
