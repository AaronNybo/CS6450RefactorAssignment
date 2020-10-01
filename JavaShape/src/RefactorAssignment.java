import java.util.Scanner;
import Shapes.*;
import interfaces.Shape;

public class RefactorAssignment {
    /**
	 * Main method that tests the calculation of Shape properties.
	 * 
	 * @param args the unused command line arguments.
	 */
	public static void main(String[] args) {

		// Init Variables
		Scanner in = new Scanner(System.in);
		Shape s;

		// Print program info
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ShapeCalc v1.1");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied shape and width");
		System.out.println("---------------------------------------------------------------------");

		// Read user input
		System.out.print("Do you want a square (1), circle (2), or equilateral triangle (3): ");
		int type = in.nextInt();
		System.out.print("Enter the shape's primary dimension (width, radius, or base): ");
		double width = in.nextDouble();

		switch (type) {
			case 1:
				s = new Square(width);
				s.printProperties();
				break;
			case 2:
				s = new Circle(width);
				s.printProperties();
				break;
			case 3:
				s = new EqTriangle(width);
				s.printProperties();
				break;
			default:
				System.out.println("Invalid value.");
				System.exit(1);
		}

		// Close Scanner
		in.close();
	}
}
