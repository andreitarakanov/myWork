package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Friends> arr = new ArrayList<Friends>();
		String tempn;
		int tempa;
		for(int i = 0;i<13;i++) {
			System.out.println("Names(with first and last) and ages seperate lines bro");
			tempn = input.nextLine();
			tempa = input.nextInt();
			arr.add(new Friends(tempn,tempa));
			
		}
		for(int i = 12;i>0;i--)
		{
			System.out.println("Name of Employee "+i+" is "+arr.get(i).getName());
			System.out.println("Age until retirement of employee "+i+" is= "+(65-arr.get(i).getAge()));
		}
	}

}
