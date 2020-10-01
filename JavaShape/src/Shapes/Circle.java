package Shapes;
import interfaces.Shape;

public class Circle implements Shape {
	
	/**
	 * The Circle's immutable width.
	 */
    private final double width;

    /**
     * Circle's default constructor
     * @param width
     */
    public Circle(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return Math.PI * (width/2) * (width/2);
    }

    public void printProperties() {
        System.out.println();
		System.out.println("Shape properties:");
		System.out.println("\tWidth: " + getWidth());
        System.out.println("\tArea: " + getArea());
        return;
    }
    
}
