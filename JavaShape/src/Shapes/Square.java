package Shapes;
import interfaces.Shape;

public class Square implements Shape {

    /**
	 * The Square's immutable width.
	 */
    private final double width;

    /**
     * Square's default constructor
     * @param width
     */
    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * width;
    }

    public void printProperties() {
        System.out.println();
		System.out.println("Shape properties:");
		System.out.println("\tWidth: " + getWidth());
        System.out.println("\tArea: " + getArea());
        return;
    }
    
}
