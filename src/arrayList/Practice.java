package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import breakreview.Rectangle;
import objectOriented.Friend;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friend> arr = new ArrayList<Friend>();
		/***		int max = 70;
		int min = 50;
		Random generator = new Random();
		for(int i = 0;i<400;i++)
		{
			arr.add(new Rectangle(min+generator.nextInt(max-min+1),min+generator.nextInt(max-min+1)));
					
		}***/
		arr.add(new Friend("Andrei"));
		arr.add(new Friend("Person"));
		arr.add(new Friend("coolman"));
		arr.add(arr.get(0));
		arr.remove(0);
		arr.set(0, arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
		
		for(int i = 0;i<arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
		
	}
}
