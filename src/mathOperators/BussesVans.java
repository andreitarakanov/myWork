package mathOperators;

import java.util.Scanner;

public class BussesVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final long peoples = 35;
		System.out.println("How many people are in your group?");
		long people  = input.nextInt();
		long bussesNeeded = Math.round((people/peoples)-0.5);
		long peopleOver = people-peoples;
		System.out.println("You have "+people+" in your group.");
		System.out.println("You need "+bussesNeeded+ " bus for your group.");
		System.out.println("You have "+peopleOver+" people left over");
		input.close();
	}

}
