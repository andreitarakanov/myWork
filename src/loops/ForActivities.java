package loops;

import java.util.Scanner;

public class ForActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite number");
		int j = input.nextInt();
		int sum = 0;
		int totalsum = 0;
		int count = 0;
		for (int i = 0; i < 50; i++) {
			sum += j;
			totalsum += sum;
			count++;
			System.out.println("The sum of the first " + count + " multiples of " + j + " is: " + totalsum);
		}
	}

}
