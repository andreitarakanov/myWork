package random;

import java.util.Random;

public class ThirteenSided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 13;
		int multtimes = 0;
		int randomNumber = 0;
		for(int i = 0;i<87;i++)
		{
			randomNumber = min + generator.nextInt(max-min+1);
			if(randomNumber==3||randomNumber==6||randomNumber==9||randomNumber==12)
			{
				multtimes++;
			}
		}
		System.out.println("Your rolled it "+multtimes);
		
	}

}
