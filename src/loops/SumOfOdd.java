package loops;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favorite number");
		int j = input.nextInt();
		int sum = 0;
		int totalsum = 0;
		int count = 0;
		for (int i = 1; i < j; i+=2) {
			sum += i;
			totalsum += sum;
			count++;
			System.out.println("The sum of the odd ints is "+sum);
		}
	}

}
