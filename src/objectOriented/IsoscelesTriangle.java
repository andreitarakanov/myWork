package objectOriented;

public class IsoscelesTriangle {
	private double base1;
	private double base2;
	private double height;
	private double leg;
	public IsoscelesTriangle()
	{
		
	}
	public IsoscelesTriangle(double base1x, double base2x, double heightx, double legx)
	{
		base1 = base1x;
		base2 = base2x;
		height = heightx;
		leg = legx;
	}
	public void setBase1(double base1x)
	{
		base1 = base1x;
	}
	public void setBase2(double base2x)
	{
		base2 = base2x;
	}
	public void setHeight(double heightx)
	{
		height = heightx;
	}
	public void setLeg(double legx)
	{
		leg = legx;
	}
	public double getBase1()
	{
		return base1;
	}
	public double getBase2()
	{
		return base2;
	}
	public double getHeight()
	{
		return height;
	}
	public double getLeg()
	{
		return leg;
	}
	public double perimeter()
	{
		double peri = base1+base2+leg+leg;
		return peri;
	}
	public double area()
	{
		double xarea = ((base1+base2)/2)*height;
		return xarea;
	}
}
