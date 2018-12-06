package strings;

import java.util.Scanner;

public class EssayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me name and text");
		String name = input.nextLine();
		String text = input.nextLine();
		Essay bob = new Essay();
		bob.setName(name);
		bob.setText(text);
		System.out.println(bob.containsX()+" your name has an x");
		System.out.println("You have "+bob.getFirstNameChars()+" letters in your first name.");
		System.out.println("Your last name is "+bob.getLastName());
		System.out.println("You have "+bob.numWords()+" words in your text essay.");
	}

}
