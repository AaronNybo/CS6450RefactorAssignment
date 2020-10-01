package Shapes;
import interfaces.Shape;

public class EqTriangle implements Shape {

    /**
	 * The EqTriangle's immutable width.
	 */
    private final double width;

    /**
     * EqTriangle's default constructor
     * @param width
     */
    public EqTriangle(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return (Math.sqrt(3)/4) * width * width;
    }

    public void printProperties() {
        System.out.println();
		System.out.println("Shape properties:");
		System.out.println("\tWidth: " + getWidth());
        System.out.println("\tArea: " + getArea());
        return;
    }
    
}
