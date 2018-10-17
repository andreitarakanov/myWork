package objectOriented;

public class Greeter {
	private int age;
	public Greeter()
	{
		this.age = 14;
		
	}
	public void setAge(int xAge)
	{
		age = xAge;
	}
	public int getAge()
	{
		return age;
	}
	public void sayHello()
	{
		System.out.println("Hello");
	}

}
