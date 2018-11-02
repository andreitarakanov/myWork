package decisionStructure;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Whats the radius of your circle?");
		Scanner input = new Scanner(System.in);
		double rad = input.nextDouble();
		int i = 0;
		while(i<10)
		{
			
		
		System.out.println("What do you want to do to the circle? 1. Display the circles radius, 2. Change the Radius, 3. Display the area, 4. Display the perimeter");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Your radius is "+rad);
				break;
			case 2:
				System.out.println("What do you want your radius to be?");
				rad = input.nextDouble();
				break;
			case 3:
				System.out.println("Your area is "+(rad*rad*Math.PI));
				break;
			case 4:
				System.out.println("Your perimeter is "+rad*2*Math.PI);
				break;
			default:
				System.out.println("You didnt choose a number");
		}
		i++;
		}
	}

}
