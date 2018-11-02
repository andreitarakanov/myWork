package decisionStructure;

import java.util.Scanner;

public class DoTheMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What are your two numbers?");
		Scanner input = new Scanner(System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		System.out.println("Which operation do you want to test? 1. Sum, 2. Difference, 3. Product, 4. Division, 5. Squaring");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Your sum is "+(num1+num2));
				break;
			case 2:
				System.out.println("Your difference is "+(num1-num2));
				break;
			case 3:
				System.out.println("Your product is "+(num1*num2));
				break;
			case 4:
				System.out.println("Your quotient is "+(num1/num2));
				break;
			case 5:
				System.out.println("Your square is "+(Math.pow(num1, 2)));
				break;
			default:
				System.out.println("You didnt choose an operation");
		}
	}

}
