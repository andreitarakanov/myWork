package strings;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me two names");
		String name1 = input.nextLine();
		String name2 = input.nextLine();
		int people = name1.compareTo(name2);
		if(people<0) {
			System.out.println("Your first name "+name1+" comes first");
		} else if(people>0)
		{
			System.out.println("Your second name "+name2+" comes first");	
		}else {
			System.out.println("Their in equal positions");
		}
	}

}
