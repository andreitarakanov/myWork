package inputExamples;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("What is your weight in pounds?");
		double weight = input.nextDouble();
		System.out.println("You are "+age+" years old, and are "+weight+" pounds.");
		input.close();
	}

}
