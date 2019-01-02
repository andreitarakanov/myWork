package arrays;

import java.util.Random;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] arr = new Rectangle[100];
		Scanner input = new Scanner(System.in);
		int max = 56;
		int min = 10;
		Random rand = new Random();
		for(int i = 0;i<100;i++)
		{
			arr[i] = new Rectangle();
			arr[i].changeLength(rand.nextInt((max - min) + 1) + min);
			arr[i].changeWidth(rand.nextInt((max - min) + 1) + min);
			
		}
		for(int i = 0;i<100;i++)
		{
			System.out.println("The length of the "+i+" rectangle is "+arr[i].returnLength());
			System.out.println("The width of the "+i+" rectangle is "+arr[i].returnWidth());
			System.out.println("The area of the "+i+" rectangle is "+arr[i].area());
		}
	}

}
