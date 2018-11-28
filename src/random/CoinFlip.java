package random;

import java.util.Random;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(8);
		int min = 1;
		int max = 2;
		int headtimes = 0;
		int tailtimes = 0;
		int randomNumber = 0;
		for(int i = 0;i<100000;i++)
		{
			randomNumber = min + generator.nextInt(max-min+1);
			if(randomNumber == 1)
			{
				headtimes++;
			}else
			{
				tailtimes++;
			}
		}
		System.out.println("Your head flips are "+headtimes);
		System.out.println("Your tail flips are "+tailtimes);
		
	}

}
