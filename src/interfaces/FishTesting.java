package interfaces;

import java.util.ArrayList;

public class FishTesting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Fish> school = new ArrayList<Fish>();
		school.add(new GoldFish());
		school.add(new Trout());
		school.add(new GoldFish());
		school.add(new Trout());
		school.add(new GoldFish());
		school.add(new Trout());
		
		int max = 0;
		int maxpos = -99;
		for(int i = 0;i<school.size();i++)
		{	
			if(school.get(i).getLength()>max)
			{
				max = (int) school.get(i).getLength();
				maxpos = i;
			}
		}
		System.out.println(school.get(maxpos).toString());
		
		
	}

}
