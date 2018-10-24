package objectOriented;

public class Circle {
	private double radius;
	public Circle()
	{
		radius = -999.9;
	}
	public Circle(double xRadius)
	{
		radius = xRadius;
	}
	public double returnRadius()
	{
		return radius;
	}
	public double circumference()
	{
		double circ = (radius*2)*Math.PI;
		return circ;
	}
	public double area()
	{
		double area = (radius*radius)*Math.PI;
		return area;
	}
	public void changeRadius(double xradius)
	{
		radius = xradius;
	}
	
}
