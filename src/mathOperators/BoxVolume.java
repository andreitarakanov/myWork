package mathOperators;

import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double boxH, boxL, boxD;
		System.out.println("Whats the Height of your box?");
		boxH = input.nextDouble();
		System.out.println("Whats the Length of your box?");
		boxL = input.nextDouble();
		System.out.println("Whats the Depth of your box?");
		boxD = input.nextDouble();
		double boxV = boxH*boxL*boxD;
		System.out.println("The volume of your box is "+boxV);
	}

}
