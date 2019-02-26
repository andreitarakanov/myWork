package comparables;

import java.util.ArrayList;
import java.util.Random;

public class CatStartTest {
	public static void main(String[] args)
	{
		
	ArrayList<CatStart> catTime = new ArrayList<CatStart>();
	Random rand = new Random();{}
	for(int i = 0;i<100;i++)
	{
		CatStart temp = new CatStart(20+ rand.nextInt((40-20+1)),0);
		catTime.add(temp);
	}
	int largep = 0;
	int smallp = 0;
	int largeamount = catTime.get(0).getAge();
	int smallamount = catTime.get(0).getAge();
	
	for(int i = 0;i<99;i++)
	{
		if(catTime.get(i).compareTo(catTime.get(largep))==0)
		{
			largeamount = catTime.get(i).getAge();
			largep = i;
		}
		if(catTime.get(i).compareTo(catTime.get(largep))==1)
		{
			largeamount = catTime.get(largep).compareTo(catTime.get(largep));
			largep = i;
		}
		if(catTime.get(i).compareTo(catTime.get(smallp))==-1)
		{
			largeamount = catTime.get(smallp).compareTo(catTime.get(smallp));
			largep = i;
		}
	}
	System.out.println(largep);
	System.out.println(smallp);
	
	System.out.println(largeamount);
	System.out.println(smallamount);
	}	
}

