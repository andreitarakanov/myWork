package arrays;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner input = new Scanner(System.in);
		int highest = 0;
		int lowest  = 100;
		int count = 0;
		for(int i = 0;i<10;i++)
		{
			System.out.println("Give me the number "+i+" test score.");
			arr[i]=input.nextInt();
		}
		for(int i = 1;i<10;i++)
		{
			if(arr[i]>=highest)
			{
				highest = arr[i];
			}
			if(arr[i]<=lowest)
			{
				lowest = arr[i];
			}
		}
		System.out.println("Highest score is "+highest);
		System.out.println("Lowest score is "+lowest);
		System.out.println("Average is "+count/10);
	}

}
