package mathOperators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the radius of your circle?");
		double radius = input.nextDouble();
		double area = (radius*radius)*Math.PI;
		System.out.println("The area of your circle is "+area);
	}

}
