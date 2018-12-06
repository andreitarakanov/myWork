package strings;

import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Password pass = new Password();
		Boolean validp=false;
		Boolean validm=false;
		int pcount = 0;
		int mcount = 0;
		String temp=null;
		do {
			pcount++;
			System.out.println("Please enter a new password in the format Last Name:Password");
			temp=input.nextLine();
			if(pass.setPass(temp)==false)
			{
				System.out.println("Invalid password.");	
			}
			if(pass.setPass(temp)==true)
			{
				validp=true;
			}
		}while(validp==false);
		do {
			mcount++;
			System.out.println("Please confirm the password.");
			temp=input.nextLine();
			if(pass.match(temp)==false)
			{
				System.out.println("Incorrect.");
			}
			if(pass.match(temp)==true)
			{
				validm = true;
			}
		}while(validm==false);
		System.out.println("It took "+pcount+" times to enter a valid password.");
		System.out.println("It took "+mcount+" to confirm the password.");
	}

}
