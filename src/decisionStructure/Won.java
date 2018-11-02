package decisionStructure;
import java.util.Scanner;
public class Won {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double epsilon = 0.00000000000001;
		System.out.println("How much money did you get on your fifth birthday?");
		double money = input.nextDouble();
		final double value = Math.sqrt(84.3);
		money = Math.sqrt(money);
		if(Math.abs(money-value)<epsilon)
		{
			System.out.println("You get a new car");
		}
		else
		{
			System.out.println("You get a bad prize");
		}
	}

}
