package loops;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Whats the first number");
		int first = input.nextInt();
		System.out.println("Whats the second number");
		int second = input.nextInt();
		sum = first +second;
		do {
			System.out.println("The sum is "+sum);
			System.out.println("Whats the first number");
			first = input.nextInt();
			System.out.println("Whats the second number");
			second = input.nextInt();
		}
		while(first!=999);
	}

}
