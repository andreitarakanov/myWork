package loops;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your number");
		double facts = input.nextDouble();
		double sum = 0;
		for (double i = facts; i > 0; i--) {
			if (facts / i - Math.floor(facts / i) == 0) {
				System.out.println(facts/i);
				sum++;
			}
		}
		System.out.println("The number of factors is "+sum);
	}
}
