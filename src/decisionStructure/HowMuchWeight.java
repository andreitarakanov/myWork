package decisionStructure;
import java.util.Scanner;
public class HowMuchWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How much do you weigh?");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		System.out.println("Which planet do you want to test? 1. Mercury, 2. Venus, 3. Mars, 4. Jupiter, 5. Saturn");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Your weight is "+weight*0.37);
				break;
			case 2:
				System.out.println("Your weight is "+weight*0.88);
				break;
			case 3:
				System.out.println("Your weight is "+weight*0.38);
				break;
			case 4:
				System.out.println("Your weight is "+weight*2.64);
				break;
			case 5:
				System.out.println("Your weight is "+weight*1.15);
				break;
			default:
				System.out.println("You didnt choose a number");
		}
	}

}
