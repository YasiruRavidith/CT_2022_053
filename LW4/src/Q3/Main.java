package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = scanner.nextDouble();

        if (ri < 0 || ro < 0 || ri > ro) {
            System.out.println("Invalid radii. Ensure 0 <= ri <= ro.");
            scanner.close();
            return;
        }

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.printf("Inner circumference: %.2f%n", innerCircle.computeCircumference());
        System.out.printf("Outer circumference: %.2f%n", outerCircle.computeCircumference());
        System.out.printf("Shaded area: %.2f%n", shadedArea);

        scanner.close();
    }
}
