package loops;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double i = 0;
		double xi = 0;
		double count = 0;
		
		while(i!=-1)
		{
			System.out.println("Please enter a number. (-1 to finish)");
			xi = input.nextInt();
			i=xi;
			double cube = Math.pow(xi, 3);
			System.out.println(cube);
			count++;
			
			
		}
		
	}

}
