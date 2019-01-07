package breakreview;

public class Circle {
	private double radius;
	public Circle() {
		radius = -99;
	}

	public Circle(double xRadius) {
		if(xRadius>0)
		{
			radius = xRadius;
		}
	}

	// Accessor Methods
	public double getRadius() {
		return radius;
	}

	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	// Mutator methods
	public void setRadius(double xRadius) {
		if(xRadius>0)
		{
			radius = xRadius;
		}
	}
}
