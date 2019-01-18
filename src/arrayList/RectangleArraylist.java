package arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import breakreview.Rectangle;
import objectOriented.Friend;

public class RectangleArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Rectangle> arr = new ArrayList<Rectangle>();
		for(int i = 0;i<20;i++)
		{
			
		}
		int max = 50;
		double largest = -1;
		double smallest = 2501;
		int lin = -99;
		int sin = -99;
		Rectangle lo = new Rectangle();
		Rectangle so = new Rectangle();
		int min = 1;
		Random generator = new Random(56);
		for(int i = 0;i<20;i++)
		{
			arr.add(new Rectangle(min+generator.nextInt(max-min+1),min+generator.nextInt(max-min+1)));
					
		}
		for(int i = 0;i<20;i++)
		{
			if(arr.get(i).area()>largest)
			{
				largest = arr.get(i).area();
				lin = i;
				lo = arr.get(i);
			}
			if(arr.get(i).area()<smallest)
			{
				smallest = arr.get(i).area();
				sin = i;
				so = arr.get(i);
			}
		}
		arr.set(0, lo);
		arr.set(19, so);
		
		for(int i = 0;i<arr.size();i++)
		{
			System.out.println(arr.get(i).area());
		}
		
	}

}
