package strings;

import java.util.Scanner;

public class NumberOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me sentence");
		String sentence = input.nextLine();
		int vowelcount = 0;
		int punctcount = 0;
		for(int i =0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'||sentence.charAt(i)=='y')
			{
				vowelcount++;
			}
			if(sentence.charAt(i)=='.'||sentence.charAt(i)==','||sentence.charAt(i)=='?'||sentence.charAt(i)=='!'||sentence.charAt(i)=='"'||sentence.charAt(i)==':'||sentence.charAt(i)==';')
			{
				punctcount++;
			}
		}
		System.out.println("Your sentence has "+vowelcount+" vowels");
		System.out.println("Your sentence has "+(sentence.length()-vowelcount-punctcount)+" consonants");
		System.out.println("Your sentence has "+punctcount+" punctuation marks");
	}

}