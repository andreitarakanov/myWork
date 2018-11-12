package decisionStructure;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your salar?");
		int salary = input.nextInt();
		if(salary>=0&&salary<20000)
		{
			System.out.println("You are a poor worker");
		}
		else
		{
			if(salary>=20000&&salary<40000)
			{
				System.out.println("You are a kinda poor manager");
			}
			else
			{
				if(salary>=40000&&salary<100000)
				{
					System.out.println("You are a ok ceo");
				}
				else
				{
					if(salary>=100000)
					{
						System.out.println("your pretty rich owner");
					}
				}
			}
		}
	}

}
