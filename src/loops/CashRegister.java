package loops;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many items did you get");
		int facts = input.nextInt();
		int sum =0;
		int sumtax = 0;
		int getprice = 0;
		for (int i=1;i<facts+1;i++) {
			System.out.println("Whats the price of item "+i);
			getprice = input.nextInt();
			sum+=getprice;
			
		}
		System.out.println("Your price without tax is "+sum);
		System.out.println("Your price of tax is "+((sum*1.05)-sum));
		System.out.println("Your price total with tax is "+sum*1.05);
	}
}
