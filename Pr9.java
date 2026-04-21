class Rectangle {
    double width;
    double height;
  
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
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.width);
        System.out.println("Height: " + rect1.height);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rect2.width);
        System.out.println("Height: " + rect2.height);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("\nRectangle 1 has a larger area.");
        } else if (rect1.getArea() < rect2.getArea()) {
            System.out.println("\nRectangle 2 has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}
/*Rectangle 1:
Width: 4.0
Height: 40.0
Area: 160.0
Perimeter: 88.0

Rectangle 2:
Width: 3.5
Height: 35.9
Area: 125.65
Perimeter: 78.8

Rectangle 1 has a larger area.*/
