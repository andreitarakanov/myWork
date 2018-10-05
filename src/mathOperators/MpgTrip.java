package mathOperators;

import java.util.Scanner;

public class MpgTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What was the distance of the trip?");
		double distance = input.nextDouble();
		System.out.println("What is the fuel economy of your car (mpg)");
		double eco = input.nextDouble();
		System.out.println("How much money did you spend on your gas?");
		double money = input.nextDouble();
		double gallons = distance/eco;
		System.out.println("You traveled "+distance);
		System.out.println("You used "+gallons+ " gallons.");
		double moneySpent = money * gallons;
		System.out.println("You overall spent $"+money);
		double mpgPrice =money/gallons;
		System.out.println("You spent $"+mpgPrice+" per gallon.");
		
		
	}

}
