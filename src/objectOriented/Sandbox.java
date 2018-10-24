package objectOriented;

import java.util.Scanner;

public class Sandbox {

	public Sandbox()
	{
		
	}
	public void sandboxFiller1()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length width and depth of your sandbox in feet?");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double depth = input.nextDouble();
		double volume = length*width*depth;
		System.out.println("At what rate do you transport sand in cubic feet?");
		double rate = input.nextDouble();
		double timeNeeded = volume/rate;
		System.out.println("It will take you "+timeNeeded+" hours to fill the sandbox.");
	}
	public void sandboxFiller2(double length, double width, double depth, double rate)
	{
		double volume = length*width*depth;
		double timeNeeded = volume/rate;
		System.out.println("It will take you "+timeNeeded+" hours to fill the sandbox.");
	}
	public double sandboxFiller3(double length, double width, double depth, double rate)
	{
		double volume = length*width*depth;
		double timeNeeded = volume/rate;
		return timeNeeded;
	}
}
