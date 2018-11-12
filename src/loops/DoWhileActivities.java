package loops;

import java.util.Scanner;

public class DoWhileActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 0;
		int si = 0;
		int ix = 0;
		do {
			i = ix;
			si = ix * 17;
			System.out.println("Your magic number is " + si);
			System.out.println("Whats your number? 9999 to quit.");
			ix = input.nextInt();
		} while (i != 9999);
	}

}
