package mathOperators;

import java.util.Scanner;

public class MoreCuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What are the dimensions of your lawn in feet?");
		double length = input.nextDouble();
		double width = input.nextDouble();
		System.out.println("What is the length of your mower deck in inches?");
		double deck = input.nextDouble();
		double newDeck = deck/12;
		double passesNeeded = Math.round((length/newDeck)+0.5);
		System.out.println("What is the speed of the mower in ft per hour?");
		double speed = input.nextDouble();
		double distanceNeeded = passesNeeded *width;
		double timeNeeded = distanceNeeded/speed;
		double money = 12*(timeNeeded-1);
		System.out.println("You will get "+money+" dollars.");
		input.close();
	}

}
