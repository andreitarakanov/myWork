package loops;

import java.util.Scanner;

public class MoreForActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int j = 0;
		int sum = 0;
		int totalsum = 0;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a number: ");
			j=input.nextInt();
			sum+=j;
			if(i%2==1)
			{
				System.out.println(j+" is odd");
			}else {
				System.out.println(j+" is even");
			}
			
		}
		
	}

}
