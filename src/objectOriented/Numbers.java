package objectOriented;

public class Numbers {

	public Numbers()
	{
		
	}
	public double returnSquare(double base)
	{
		base = base*base;
		return base;
	}
	public double returnArea(double length, double width)
	{
		double area = length*width;
		return area;
	}
	public double returnRoundUp(double input)
	{
		double answer = Math.round((input)+0.5);
		return answer;
	}
}
