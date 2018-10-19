package objectOriented;

public class ShapeTest {
	private double length;
	private double width;
	private double radius;
	private double base;
	private double height;
	private double base1;
	private double base2;
	private double height1;
	private double leg;
	public ShapeTest()
	{
		
	}
	public ShapeTest(double lengthx, double widthx, double radiusx, double basex, double heightx, double base1x, double base2x, double height1x, double legx)
	{
			length = lengthx;
			width = widthx;
			radius = radiusx;
			base = basex;
			height = heightx;
			base1 = base1x;
			base2 = base2x;
			height1 = height1x;
			leg = legx;
	}
	public double returnLength()
	{
		return length;
	}
	public double returnWidth()
	{
		return width;
	}
	public double rectanglePerimeter()
	{
		double peri = length*2+width*2;
		return peri;
	}
	public double rectangleaArea()
	{
		double area = length*width;
		return area;
	}
	public void changeLength(double xLength)
	{
		length = xLength;
	}
	public void changeWidth(double xWidth)
	{
		width = xWidth;
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
	public double cirlceArea()
	{
		double area = (radius*radius)*Math.PI;
		return area;
	}
	public void changeRadius(double xradius)
	{
		radius = xradius;
	}
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	public void setBase(double basex)
	{
		base = basex;
	}
	public void setHeight(double heightx)
	{
		height = heightx;
	}
	public double hypot()
	{
		double unsquared = (base*base)+(height*height);
		double pot = Math.sqrt(unsquared);
		return pot;
	}
	public double rightPerimeter()
	{
		double perimeterr = (base*2)+(height*2);
		return perimeterr;
	}
	public double rightArea()
	{
		double area = (base*height)/2;
		return area;
	}
	
}
