package objectOriented;

public class Phone { 
	private double phonenum = 2624448155D;
	private double lastnum;
	private double speedDial;
	private double emergency = 911;
	private double numcalls;
	private double minutes;
	public Phone() 
	{
		
	}
	public Phone(double xphonenum, double xspeedDial)
	{
		phonenum = xphonenum;
		speedDial = xspeedDial;
	}
	public void makeCall(double number, double time)
	{
		numcalls++;
		lastnum = number;
		minutes+=time;
	}
	public double getPhoneNum()
	{
		return phonenum;
	}
	public double getLastNum()
	{
		return lastnum;
	}
	public double speedDial()
	{
		return speedDial;
	}
	public double numCalls()
	{
		return numcalls;
	}
	public double minutes()
	{
		return minutes;
	}
	public double emerg()
	{
		return emergency;
	}
}
