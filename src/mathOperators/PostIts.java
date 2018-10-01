package mathOperators;

import java.util.Scanner;

public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How big are your post it notes (square inches)");
		int area = input.nextInt();
		System.out.println("How big is your wall (square feet)");
		int numNeeded = input.nextInt();
		int postNeeded = (numNeeded*144)/area;
		System.out.println("You need "+postNeeded+" notes");
		input.close();
	}

}
