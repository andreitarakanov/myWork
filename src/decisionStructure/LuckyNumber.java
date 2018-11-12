package decisionStructure;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your age?");
		int age = input.nextInt();
		if(age>=18)
		{
			System.out.println("Whats your height?");
			int height = input.nextInt();
			System.out.println("Your lucky number is "+height*5);
		}
		else
		{
			System.out.println("Whats your weight?");
			int weight = input.nextInt();
			System.out.println("Your lucky number is "+weight/2);
		}
	}

}
