package strings;

import java.util.jar.Attributes.Name;

public class Essay {
	private String fname;
	private String lname;
	private String name;
	private String text;
	public Essay()
	{
		
	}
	public void setName(String xname)
	{
		name = xname;
		for(int i = 0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				fname = name.substring(0, i);
				lname = name.substring(i+1,name.length());
			}
		}
	}
	public void setText(String xtext)
	{
		text = xtext;
	}
	public String getLastName()
	{
		String nlname = lname.toUpperCase();
		return nlname;
	}
	public int getFirstNameChars()
	{
		int chars = fname.length();
		return chars;
	}
	public Boolean containsX()
	{
		Boolean contains = false;
		for(int i = 0;i<name.length();i++)
		{
			if(name.charAt(i)=='x'||name.charAt(i)=='X')
			{
				contains = true;
			}
		}
		return contains;
	}
	public int numWords()
	{
		int words = 0;
		
		if(text.length()!=0)
		{
			words = 1;
		}
		for(int i = 0;i<text.length();i++)
		{
			if((i<(text.length()-1)&&text.charAt(i)!=' '&&text.charAt(i+1)==' '))
			{
				words++;
			}
		}
		if(text.charAt(text.length()-1)==' ')
		{
			words--;
		}
		return words;
	}
}
