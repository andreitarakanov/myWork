package objectOriented;

public class CarClass {
	private double mpg;
	private double fuelCap;
	private double fuel;
	private double odo;
	
	public CarClass()
	{
		mpg = 20;
		fuelCap = 20;
		fuel = 20;
		odo = 0;
	}
	public CarClass(double xmpg, double xfuelCap, double xfuel, double xodo)
	{
		mpg = xmpg;
		fuelCap = xfuelCap;
		fuel = xfuel;
		odo = xodo;
	}
	public void fillTank(double xgas)
	{
		fuel+=xgas;
	}
	public void driveCar(double miles)
	{
		if(miles<=fuel*mpg)
		{
			double gallonsused = miles/mpg;
			odo+=miles;
			fuel-=gallonsused;
		}else {
			System.out.println("bro u literally running on fumes");
		}
	}
	public double getMpg()
	{
		return mpg;
	}
	public double getFuelCap()
	{
		return fuelCap;
	}
	public double getFuel()
	{
		return fuel;
	}
	public double getOdo()
	{
		return odo;
	}
}
