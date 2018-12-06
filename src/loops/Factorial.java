package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your number?");
		int facts = input.nextInt();
		int sum = 0;
		sum+=facts;
		for(int i = facts-1;i>0;i--)
		{
			sum=sum*i;
		}
		System.out.println("Your factorial is "+sum);
	}

}
