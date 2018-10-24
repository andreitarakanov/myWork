package objectOriented;

public class Cat {
	private int age;
	private int sleep;
	public Cat()
	{
		
	}
	public void birthday()
	{
		age++;
	}
	public void sleepMore()
	{
		sleep++;
	}
	public void sleepLess()
	{
		sleep--;
	}
	public int getSleep()
	{
		return sleep;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int xage)
	{
		age = xage;
	}
	public void setSleep(int xsleep)
	{
		sleep = xsleep;
	}
}
