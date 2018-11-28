package random;

import java.util.Random;

public class FishingCamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(8);
		int min = 26;
		int max = 43;
		int heighttimes = 0;
		int randomNumber = 0;
		for(int i = 0;i<248;i++)
		{
			randomNumber = min + generator.nextInt(max-min+1);
			if(randomNumber>36)
			{
				heighttimes++;
			}
		}
		System.out.println("The number of taller first graders is "+heighttimes);
		
	}

}
