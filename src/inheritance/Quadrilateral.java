package inheritance;

public class Quadrilateral {
	private double side1,side2,side3,side4;
	public Quadrilateral(){
		
	}
	public Quadrilateral(double x1, double x2, double x3, double x4) {
		side1 = x1;
		side2 = x2;
		side3 = x3;
		side4 = x4;
	}
	public String toString() {
		return "cool gaming type = quad sides  = "+(side1)+(side2)+(side3)+(side4);
	}
	public double get1() {
		return side1;
	}
	public double get2() {
		return side2;
	}
	public double get3() {
		return side3;
	}
	public double get4() {
		return side4;
	}
	public void set1(double x)
	{
		side1 = x;
	}
	public void set2(double x)
	{
		side2 = x;
	}
	public void set3(double x)
	{
		side3 = x;
	}
	public void set4(double x)
	{
		side4 = x;
	}
	
	public double perimeter() {
		return side1+side2+side3+side4;
	}
}
