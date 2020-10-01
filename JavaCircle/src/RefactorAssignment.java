import java.util.Scanner;
import Shapes.Circle;

public class RefactorAssignment {
    public static void main(String[] args) {
        // Create Scanner
        Scanner in = new Scanner(System.in);

        // Print program info
		System.out.println("------------------------------------------------------------");
		System.out.println("CircleCalc v1.0");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied radius");
		System.out.println("------------------------------------------------------------");

        // Read user input
		System.out.print("Enter the circle's radius: ");
        Circle c = new Circle(in.nextDouble());
        System.out.print("Enter radian value for calculation: ");
        double radian = in.nextDouble();
        System.out.print("Enter degree value for calculation: ");
        double degree = in.nextDouble();

        // Print results
		System.out.println();
		System.out.println("Circle properties:");
		System.out.println("\tRadius: " + c.getRadius());
		System.out.println("\tDiameter: " + c.getDiameter());
		System.out.println("\tArea: " + c.getDiameter());
		System.out.println("\tArc length at " + radian + " radian: " + c.getRadiansArcLength(radian));
		System.out.println("\tArc length at" + degree + "degrees: " + c.getDegreesArcLength(degree));
		System.out.println("\tSector area at " + radian + " radian: " + c.getRadiansSectorArea(radian));
        System.out.println("\tSector area at" + degree + "degrees: " + c.getDegreesSectorArea(degree));
        
        // Close Scanner
        in.close();
	}
}
