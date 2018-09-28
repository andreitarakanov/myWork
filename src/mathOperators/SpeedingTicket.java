package mathOperators;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the speed limit?");
		int limit = input.nextInt();
		System.out.println("What speed were you going?");
		int speed = input.nextInt();
		int cost = ((speed-limit-1)*40)+55;
		System.out.println("You are required to pay $"+cost);
	}

}
