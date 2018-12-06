package strings;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me ssn");
		String ssn = input.nextLine();
		System.out.println(ssn.substring(0, 3));
		System.out.println(ssn.substring(3, 5));
		System.out.println(ssn.substring(5, 9));
		/**ssn.replaceAll("-","");
		for(int i = 0;i<3;i++)
		{
			System.out.print(ssn.charAt(i));
		}
		System.out.println("");
		for(int i = 4;i<6;i++)
		{
			System.out.print(ssn.charAt(i));
		}
		System.out.println("");
		for(int i = 7;i<11;i++)
		{
			System.out.print(ssn.charAt(i));
		}**/
	}

}
