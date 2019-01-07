package breakreview;

import java.util.Random;

public class Review1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] arr = new Circle[5];
		double count = 0;
		int min = 1;
		int max = 10;
		Random generator = new Random(5);
		//min+generator.nextint(max-min+1);
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = new Circle(min+generator.nextInt(max-min+1));
			count+=arr[i].area();
		}
		System.out.println(count);
	}
}
