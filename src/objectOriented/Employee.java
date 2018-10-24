package objectOriented;

public class Employee {
	private double wage;
	private int experience;
	public Employee()
	{
		this.wage = 10.50;
		this.experience = 1;
	}
	public void setWage(double wage)
	{
		this.wage = wage;
		
	}
	public void setXP(int xp)
	{
		this.experience = xp;
	}
	public double getWage()
	{
		return wage;
		
	}
	public void raise()
	{
		wage = wage*1.1;
	}
	public int getXP()
	{
		return experience;
	}
}
