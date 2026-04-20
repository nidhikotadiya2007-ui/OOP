import java.util.*;

public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Triangle is valid.");
            System.out.println("Area of triangle = " + area);

        } else {
            System.out.println("Invalid triangle. The given sides do not form a triangle.");
        }
    }
}
/*output:
Enter side a: 6
Enter side b: 8
Enter side c: 10
Triangle is valid.
Area of triangle = 24.0
  */
