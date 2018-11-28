package random;
import java.util.Random;
import java.util.Scanner;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		System.out.println("How many sides does your dice have");
		int max = input.nextInt();
		int min = 1;
		System.out.println("How many times do you want to roll the dice");
		int times = input.nextInt();
		int randomNumber = 0;	
		for(int i = 0;i<times;i++)
		{
			randomNumber = min + generator.nextInt(max-min+1);
			System.out.println("You rolled "+randomNumber);
		}
		
	}

}
