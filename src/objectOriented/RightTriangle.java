package objectOriented;

public class RightTriangle {
	private double base;
	private double height;
	public RightTriangle()
	{
		
	}
	public RightTriangle(double basex, double baseh)
	{
		base = basex;
		height = baseh;
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
	public double perimeter()
	{
		double perimeterr = (base*2)+(height*2);
		return perimeterr;
	}
	public double area()
	{
		double area = (base*height)/2;
		return area;
	}
}
