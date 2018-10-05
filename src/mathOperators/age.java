package mathOperators;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ageOf;
		System.out.println("How old are you?");
		ageOf = input.nextInt();
		ageOf+=7;
		System.out.println("You will be "+ageOf+" years old in 7 years");
	}

}
