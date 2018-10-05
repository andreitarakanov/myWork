package mathOperators;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you right now?");
		int age = input.nextInt();
		int ageLeft = 18 - age;
		if(age>=18)
		{
			System.out.println("You can vote right now! You are "+age+" years old!");
		} else {
			System.out.println("You will be able to vote in "+ageLeft+" years");
		}
		input.close();
	}

}
