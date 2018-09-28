package mathOperators;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want your dividend to be?");
		double dividend = input.nextDouble();
		System.out.println("What do you want your divisor to be?");
		double divisor = input.nextDouble();
		double remainder = dividend%divisor;
		double whole = Math.round((dividend/divisor)-0.5);
		System.out.println(Math.round(whole)+" r "+Math.round(remainder));
	}

}
