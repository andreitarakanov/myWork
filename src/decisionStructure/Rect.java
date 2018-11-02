package decisionStructure;

public class Rect {
	private double length;
	private double width;
	public Rect()
	{
		
	}
	public Rect(double l, double w)
	{
		length = l;
		width = w;
	}
	public double returnLength()
	{
		return length;
	}
	public double returnWidth()
	{
		return width;
	}
	public double perimeter()
	{
		double peri = length*2+width*2;
		return peri;
	}
	public double area()
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
}
