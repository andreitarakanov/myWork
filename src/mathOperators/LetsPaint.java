package mathOperators;

import java.util.Scanner;

public class LetsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and width in feet of your room?");
		double length = input.nextInt();
		double width = input.nextInt();
		double neededFeet = ((length*2)+(width*2))*8;
		double numGallons = Math.round((neededFeet/150)+0.5);
		System.out.println("The dimensions of your room is "+length+" - "+width);
		System.out.println("You need to paint "+neededFeet+" feet.");
		System.out.println("You will need "+ numGallons +" gallons.");
		input.close();
	}

}
