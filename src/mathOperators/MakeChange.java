package mathOperators;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How much money would you like to make change for?");
		double change = input.nextDouble();
		double dollars = Math.floor(change);
		change= change-dollars;
		//System.out.println(change);
		change = change*100;
		//System.out.println(change);
		double quarters = Math.floor(change/25);
		change = Math.round(change-(quarters*25));
		//System.out.println(change);
		double dimes  = Math.floor(change/10);
		change = Math.round(change-(dimes*10));
		//System.out.println(change);
		double nickels = Math.floor(change/5);
		change = Math.round(change-(nickels*5));
		//System.out.println(change);
		double pennies = change;
		System.out.println("You will have: ");
		System.out.println(dollars+" dollars");
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickels+" nickels");
		System.out.println(pennies+" pennies");
		input.close();
		
	}

}
