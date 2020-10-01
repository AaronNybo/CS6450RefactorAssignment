import java.util.Scanner;
import interfaces.Shape;

public class RefactorAssignment {
    /**
	 * Main method that tests the calculation of Shape properties.
	 * 
	 * @param args the unused command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ShapeCalc v1.0");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied shape and width");
		System.out.println("---------------------------------------------------------------------");

		Scanner in = new Scanner(System.in);

		System.out.print("Do you want a square (1), circle (2), or equilateral triangle (3): ");
		int type = in.nextInt();
		
		System.out.print("Enter the shape's primary dimension (width, radius, or base): ");
		double width = in.nextDouble();
		
		Shape s = new Shape(type, width);

		System.out.println();
		System.out.println("Shape properties:");
		System.out.println("\tWidth: " + s.getWidth());
		System.out.println("\tArea: " + s.getArea());
	}
}
