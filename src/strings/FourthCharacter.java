package strings;

import java.util.Scanner;

public class FourthCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me sentence");
		String sent = input.nextLine();
		System.out.print(sent.charAt(0));
		for(int i =1;i<Math.round((sent.length()/4)+0.5);i++)
		{
			System.out.print(sent.charAt((i*4)-1)+", ");
		}
	} 

}
