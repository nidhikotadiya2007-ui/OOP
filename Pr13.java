import java.util.*;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}

public class Pr13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
      
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.getData(base, height);

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        r.getData(length, width);

        System.out.println("Area of Triangle: " + t.getArea());
        System.out.println("Area of Rectangle: " + r.getArea());

    }
}
/*output 
  Enter base and height of triangle: 10 5
Enter length and width of rectangle: 4 6
Area of Triangle: 25.0
Area of Rectangle: 24.0
  */
