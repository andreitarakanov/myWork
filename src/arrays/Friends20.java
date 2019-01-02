package arrays;

import java.util.Scanner;

public class Friends20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[20];
		Scanner input = new Scanner(System.in);
		for(int i = 0;i<20;i++)
		{
			System.out.println("Give the "+(i+1)+" name");
			arr[i]=input.nextLine();
		}
		/***System.out.println("Give me a letter");
		String letter = input.nextLine();
		char xletter = letter.charAt(0);
		int ending = 0;***/
		System.out.println("Whats the length of your first name?");
		int firstname = input.nextInt();
		for(int i = 0;i<20;i++)
		{
			//ending = arr[i].length()-1;
			//if(arr[i].charAt(ending)==xletter)
			//{
			//	System.out.println(arr[i]);
			//}
			//for(int j = 0;i<arr[j])
			if(arr[i].length()==firstname)
			{
				System.out.println(arr[i]);
			}
		}
		/****for(int i = 19;i>-1;i--)
		{
			System.out.println(arr[i]);
		}***/
	}

}
