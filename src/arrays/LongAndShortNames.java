package arrays;

import java.util.Scanner;

public class LongAndShortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many people do you know?");
		int people = input.nextInt();
		String longest = "A";
		String shortest = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
		int range = 0;
		
		String[] arr = new String[people];
		for(int i = 0;i<people;i++)
		{
			System.out.println("What is friend number "+(i+1)+" named.");
			arr[i] = input.nextLine();
			if(arr[i].length()>longest.length())
			{
				longest = arr[i];
			}
			if(arr[i].length()<shortest.length())
			{
				shortest = arr[i];
			}
			
		}
		for(int i = 0;i<people;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("The longest name is "+longest);
		System.out.println("The shortest name is "+shortest);
		System.out.println("The range name is "+(longest.length()-shortest.length()));
		
		
	}

}
