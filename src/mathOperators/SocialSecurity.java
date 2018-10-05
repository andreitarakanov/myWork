package mathOperators;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("Whats your SSN?");
		double ssn = input.nextDouble();
		double digits = ssn%10000;
		int ageLeft = 18 - age;
		if(age>=18)
		{
			System.out.println("You are 18 and over right now");
		} else {
			System.out.println("You will be 18 in "+ageLeft+" years");
		}
		System.out.println("Your ssn is: "+ssn);
		System.out.println("Your 4 digit code is: "+digits);
		input.close();
	}

}
