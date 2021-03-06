package Shapes;

/**
 * The Circle class defines a circle specified in double precision.
 *
 */
public class Circle {
	/**
	 * The circle's immutable radius.
	 */
	private final double radius;

	/**
	 * Constructs a new Circle with the specified radius
	 * 
	 * @param radius the radius of the circle
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Returns the radius of this Circle in double precision.
	 * 
	 * @return the radius of this Circle.
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Returns the diameter of this Circle in double precision.
	 * 
	 * @return the diameter of this Circle.
	 */
	public double getDiameter() {
		return 2 * Math.PI * radius;
	}
	
	/**
	 * Returns the area of this Circle in double precision.
	 * 
	 * @return the area of this Circle.
	 */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * Returns the length of an arc for this Circle given an angle specified in radians.
	 * 
	 * @param theta the angle in radians.
	 * @return the arc length for the given angle.
	 */
	public double getRadiansArcLength(double theta) {
		return radius * theta;
	}
	
	/**
	 * Returns the length of an arc for this Circle given an angle specified in degrees.
	 * 
	 * @param alpha the angle in degrees.
	 * @return the arc length for the given angle.
	 */
	public double getDegreesArcLength(double alpha) {
		return Math.PI * radius * alpha / 180;
	}
	
	/**
	 * Returns the area of a sector for this Circle given an angle specified in radians.
	 * 
	 * @param theta the angle in radians.
	 * @return the sector area for the given angle.
	 */
	public double getRadiansSectorArea(double theta) {
		return radius * radius * theta / 2;
	}
	
	/**
	 * Returns the area of a sector for this Circle given an angle specified in degrees.
	 * 
	 * @param alpha the angle in degrees.
	 * @return the sector area for the given angle.
	 */
	public double getDegreesSectorArea(double alpha) {
		return 3.1415926 * radius * radius * alpha / 360; 
	}
	
}
