package decisionStructure;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your age?");
		int age = input.nextInt();
		System.out.println("How many years of experience do you have?");
		double xp = input.nextDouble();
		System.out.println("Whats your height in inches?");
		double height = input.nextDouble();
		boolean promo = false;
		if(age>=50)
		{
			if(Math.abs(xp-10.5)<0.000000000001)
			{
				if(height<70||height>80)
				{
					promo = true;
				}
			}
		}
		else
		{
			if(height>=70&&height<=80)
			{
				promo = true;
			}
			else
			{
				promo = false;
			}
		}
		if(promo == true)
		{
			System.out.println("You get a promo");
		}
		else
		{
			System.out.println("You dont get a promo");
		}
	}

}
