package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your dad's name?");
		String dad = input.nextLine();
		System.out.println("Whats your animals age in their years?");
		int animalAge = input.nextInt();
		System.out.println("Whats your social security number?");
		long socialSecurityNumber = input.nextLong();
		System.out.println("When you are "+animalAge+" you will meet someone named "+dad+" and you will live with them to age "+socialSecurityNumber);
		input.close();
	}

}
