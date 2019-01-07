package breakreview;

import java.util.Scanner;

public class Review3Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[2];
		Scanner input = new Scanner(System.in);
		String temp = "";
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter a students name First Last");
			arr[i] = input.nextLine();
		}
		System.out.println("Student info");
		for(int i = 0;i<arr.length; i++)
		{
			temp = arr[i].substring(arr[i].indexOf(' ')+1);
			System.out.println(arr[i].substring(arr[i].indexOf(' ')-1, arr[i].indexOf(' '))+" "+temp.length());
			
			
		}
}

}
