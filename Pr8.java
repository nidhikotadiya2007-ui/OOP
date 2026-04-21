import java.util.*;

class Pr8{
    private int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
  
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        Point p1 = new Point();
        System.out.println("Default constructor:");
        p1.display();

        System.out.print("\nEnter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized constructor:");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy constructor (copy of entered point):");
        p3.display();

    }
}
/*output:
Enter x coordinate: 3
Enter y coordinate: 7
  Default constructor:
Point coordinates: (5, 5)

Enter x coordinate: 3
Enter y coordinate: 7
Parameterized constructor:
Point coordinates: (3, 7)
Copy constructor (copy of entered point):
Point coordinates: (3, 7)*/
