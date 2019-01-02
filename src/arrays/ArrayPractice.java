package arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		MallSanta[][] arr = new MallSanta[18][5];
		int max = 100;
		int min = 0;
		int temp= 0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[0].length;j++)
			{
				temp = (rand.nextInt((max - min) + 1) + min);
				arr[i][j] = new MallSanta("Cool",temp,true);
			}
		}
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j].getAge()+" ");
			}
			System.out.println("");
		}
		
	}

}
