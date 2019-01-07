package breakreview;

import java.util.Random;

public class Review3Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1340];
		int min = 1;
		int max = 17;
		double counte = 0;
		int count7 = 0;
		Random generator = new Random(5);
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = min+generator.nextInt(max-min+1);
			if(arr[i]%2==0)
			{
				counte++;
			}
		}
		for(int i = 1339;i>-1;i--)
		{
			if(arr[i]>7)
			{
				count7++;
			}
		}
		System.out.println((counte/1340)*100+"%");
		System.out.println(count7);
	}

}
