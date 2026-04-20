import java.util.*;

class Pr6 {
    double width = 1;
    double height = 1;
    Rectangle() {
    }
  
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        Rectangle r = new Rectangle(width, height);
 
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
    }
}
/*output:
Enter width: 4
Enter height: 6
Area = 24.0
Perimeter = 20.0
  */
