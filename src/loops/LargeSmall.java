package loops;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double i = 0;
		double xi = 0;
		double higher = 0;
		double lower = 100;
		while(i!=9999.9)
		{
			System.out.println("Please enter a test score. (9999.9 to compute)");
			xi = input.nextDouble();
			i=xi;
			if(xi>=higher&&i!=9999.9)
			{
				higher = xi;
			}
			if(xi<=lower&&i!=9999.9)
			{
				lower = xi;
			}
			
			
			
		}
		System.out.println("Your lower test score is " +lower);
		System  .out.println("Your higher test score is "+higher);
	}

}
