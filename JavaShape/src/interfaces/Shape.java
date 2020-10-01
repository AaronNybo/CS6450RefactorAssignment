package interfaces;

/**
 * The Shape class defines a shape specified in double precision.
 *
 */
public interface Shape {

	/**
	 * Returns the width of this Shape in double precision.
	 * 
	 * @return the width of this Shape.
	 */
	public double getWidth();
	
	/**
	 * Returns the area of this Shape in double precision.
	 * 
	 * @return the area of this Shape.
	 */
	public double getArea();

	/**
	 * Prints shape properties.
	 * 
	 * @return the area of this Shape.
	 */
	public void printProperties();
}
