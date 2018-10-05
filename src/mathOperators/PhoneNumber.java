package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your phone number? no +1");
		double number = input.nextDouble();
		double first3 = Math.round((number/10000000)-0.5);
		double second3 = (Math.round((number/10000)-0.5))%1000;
		double last4 = number%10000;
		System.out.println("Your phone number is "+Math.round(number));
		System.out.println("The first three numbers are "+Math.round(first3));
		System.out.println("The second three numbers are "+Math.round(second3));
		System.out.println("The last four numbers are "+Math.round(last4));
		input.close();
	}

}
