package strings;

import java.util.Scanner;

public class DisplaySentenceLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me sentence");
		String sentence = input.nextLine();
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
	}

}
