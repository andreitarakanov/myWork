package mathOperators;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What are the dimensions of your lawn in yards?");
		double length = input.nextDouble();
		double width = input.nextDouble();
		System.out.println("What is the radius of your fountain in feet?");
		double radius = input.nextDouble();
		double area = length*width*9;
		double finalarea = area-(radius*radius*3.14);
		double pay =  (finalarea/100)*1.25;
		System.out.println("You will get "+pay+" dollars.");
		input.close();
	}

}
