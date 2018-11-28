package random;

import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 0;
		int max = 100;
		
		int randomNumber = min + generator.nextInt(max-min+1);
		System.out.println(randomNumber);
	}

}
