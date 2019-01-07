package breakreview;

import java.util.Random;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double count = 0;
		Rectangle[][] arr = new Rectangle[2][2];
		int min = 1;
		int max = 25;
		Random generator = new Random();
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[0].length;j++)
			{
				arr[i][j] = new Rectangle(min+generator.nextInt(max-min+1),min+generator.nextInt(max-min+1));
				count+=arr[i][j].perimeter();
			}
		}
		System.out.println("The sides of the rectangle range from 1 inch to 25 inches");
		System.out.println(arr.length*arr[0].length + " rectangles were tested.");
		System.out.println(count+" inches was the sum of the perimeters."); 
	}

}
