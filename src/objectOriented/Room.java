package objectOriented;

import java.util.Scanner;

public class Room {
	public Room()
	{
		
	}
	public void area()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length and height of a wall?");
		double length = input.nextDouble();
		double height = input.nextDouble();
		System.out.println("The area of your wall is "+length*height);
	}
	public void areaWithDoor()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What the length and height of a wall?");
		double length = input.nextDouble();
		double height = input.nextDouble();
		double area = length*height;
		System.out.println("Whats the length and height of your door?");
		double doorL = input.nextDouble();
		double doorH = input.nextDouble();
		double doorA = doorL*doorH;
		area = area-doorA;
		System.out.println("The area of your wall is "+area);
	}
}
