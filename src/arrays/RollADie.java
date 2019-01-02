package arrays;

import java.util.Scanner;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] arr = new double[10000];
		Scanner input = new Scanner(System.in);
		Boolean finished = false;
		for(int i = 0;i<10000;i++)
		{
			arr[i]=Math.round((Math.random()*6)+0.5);
		}
		do {
			System.out.println("What number would you like to check? 999 to quit.");
			int num = input.nextInt();
			if(num==999)
			{
				finished = true;
			}
			if(finished ==false)
			{
				System.out.println(arr[num]);
			}
		}while(finished ==false);
	}

}
