package strings;

public class Password {
	private String pass;
	private String name;
	public Password(){
		pass = "1aaaaa!?";
	}
	public Boolean setPass(String xpass) {
		String xxpass = null;
		Boolean finished = false;
		for(int i = 0;i<xpass.length();i++)
		{
			if(xpass.charAt(i)==':')
			{
				name = xpass.substring(0, i);
				xxpass = xpass.substring(i+1,xpass.length());
			}
		}
		if(xxpass.charAt(0)=='0'||xxpass.charAt(0)=='1'||xxpass.charAt(0)=='2'||xxpass.charAt(0)=='3'||xxpass.charAt(0)=='4'||xxpass.charAt(0)=='5'||xxpass.charAt(0)=='6'||xxpass.charAt(0)=='7'||xxpass.charAt(0)=='8'||xxpass.charAt(0)=='9') {
			if(xxpass.length()>7&&xxpass.length()<21)
			{
				Boolean spaces = false;
				Boolean	question = false;
				Boolean exclamation = false;
				for(int i = 0;i<xxpass.length();i++)
				{
					if(xxpass.charAt(i)=='?')
					{
						question = true;
					}
					if(xxpass.charAt(i)=='!')
					{
						exclamation = true;
					}
					if(xxpass.charAt(i)==' ')
					{
						spaces = true;
					}
					
				}
				if(spaces == false&&question==true&&exclamation==true)
				{
					finished = true;
					pass = xxpass;
				}
			}
		}
		return finished;
	}
	public Boolean match(String xpass)
	{
		Boolean matched = false;
		if(pass.compareTo(xpass)==0)
		{
			matched = true;
		}
		return matched;
	}
}
