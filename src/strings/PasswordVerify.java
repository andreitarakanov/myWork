package strings;

import java.util.Scanner;

public class PasswordVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean correct = false;
		String pass;
		String passv;
		do {
			System.out.println("Please enter a password");
			pass = input.nextLine();
			System.out.println("Please verify your password");
			passv = input.nextLine();
			if(pass.compareTo(passv)==0)
			{
				correct=true;
			}
		} while(correct!=true);
		System.out.println("Good job.");
	}

}
