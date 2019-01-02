package arrays;

public class MallSanta {
	private String name = null;
	private int age = 0;
	private Boolean crec = false;
	public MallSanta(String xname, int xage, Boolean xcrec) {
		name = xname;
		age = xage;
		crec = xcrec;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Boolean employable()
	{
		if(age>50&&age<70)
		{
			if(crec == false)
			{
				return true;
			}
			else {
				return false;
			}
			
		} else {
			return false;
		}
	}
}
