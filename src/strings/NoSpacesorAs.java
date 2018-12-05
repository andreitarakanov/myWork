package strings;

import java.util.Scanner;

public class NoSpacesorAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me sentence");
		String sentence = input.nextLine();
		char a = 'a';
		char space = ' ';
		for(int i =0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)!=a&&sentence.charAt(i)!=space)
			{
				System.out.print(sentence.charAt(i));
			}
		}
	}

}
