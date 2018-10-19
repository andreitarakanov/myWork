package objectOriented;

public class Worker {
private int hours;
private double pay;
	public Worker()
	{
		
	}
	public int getHours()
	{
		return hours;
	}
	public void setHours(int xhour)
	{
		hours = xhour;
	}
	public double getPay()
	{
		return pay;
	}
	public void setPay(double xpay)
	{
		pay = xpay;
	}
	public double payCheck()
	{
		double total = hours*pay;
		return total;
	}
	public void raise(double raiser)
	{
		pay = pay+raiser;
	}

}
