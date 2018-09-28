package mathOperators;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the radius of your sphere?");
		double radius = input.nextDouble();
		double answer = (radius*radius*radius)*Math.PI*4/3;
		System.out.println("Your sphere is "+answer+" units");
	}

}
