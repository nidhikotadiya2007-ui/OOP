import java.util.*;

public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = sc.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = sc.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
      
        double bmi = weightKg / (heightMeters * heightMeters);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
/*output:
Enter your weight in pounds: 150
Enter your height in inches: 65
Your BMI is: 24.96
  */
