package loops;

import java.util.Scanner;

public class DoWhileActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 0;
		int lower = 0;
		int higher = 0;
		do {
			if (higher == 0 && lower == 0) {
				higher = i;
			} else if (lower == 0 && (i > higher || i == higher)) {
				lower = higher;
				higher = i;
			} else if (i > higher) {
				higher = i;
			} else if (i < lower) {
				lower = i;
			} else if (lower == 0 && i < higher) {
				lower = i;
			}
			System.out.println("Whats your number? 9999 to quit.");
			i = input.nextInt();
		} while (i != 9999);
		int difference = Math.abs(higher - lower);
		System.out.println("Your difference is " + difference);
	}

}
