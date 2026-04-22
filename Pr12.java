import java.util.*;

class Pr12{
  
    public static double calculateVolume(double side) {
        return side * side * side;
    }
  
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();

        System.out.print("Enter length, width, height of rectangular cube: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.print("Enter radius of sphere: ");
        float radius = sc.nextFloat();

        double cubeVolume = calculateVolume(side);
        double rectangularCubeVolume = calculateVolume(length, width, height);
        double sphereVolume = calculateVolume(radius);

        System.out.println("\n--- Volumes ---");
        System.out.println("Cube: " + cubeVolume);
        System.out.println("Rectangular Cube: " + rectangularCubeVolume);
        System.out.println("Sphere: " + sphereVolume);
    }
}
/*output:
Enter side of cube: 5
Enter length, width, height of rectangular cube: 4 3 2
Enter radius of sphere: 3

--- Volumes ---
Cube: 125.0
Rectangular Cube: 24.0
Sphere: 113.09733552923254*/
