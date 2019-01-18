package objectOriented;

public class Friend {
	private String name = null;
	public Friend()
	{
		
	}
	public Friend(String xname) {
		name = xname;
	}
	public void sayMessage()
	{
		System.out.println("You are a good person");
	}
	public String returnName()
	{
		return name;
	}
	
}
