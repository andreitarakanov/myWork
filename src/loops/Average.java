package loops;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num = 0;
		double i = 0;
		double xi = 0;
		double count = 0;
		double average = 0;
		while(i!=9999.9)
		{
			System.out.println("Please enter a test score. (9999.9 to compute)");
			xi = input.nextDouble();
			i=xi;
			if(xi>=64&&i!=9999.9)
			{
				num +=xi;
				count++;
			}
		}
		average = num/count;
		System.out.println("Your sum is " +num);
		System.out.println("Your average is "+average);
		
	}

}
