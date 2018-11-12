package loops;

import java.util.Scanner;

public class Count5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double i = 0;
		double xi = 0;
		double count = 0;
		System.out.println("Please enter a number to count to from 0.");
		xi = input.nextInt();	
		
		while(i<=xi)
		{
			System.out.println(i);
			i+=5;
			
		}
	}

}
