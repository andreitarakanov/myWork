package decisionStructure;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int length=0;
		int width=0;
		
		int i = 0;
		while(i<10)
		{
			
		
		System.out.println("What do you want to do to the rectangle? 1. Display the rects length and width, 2. Change the Length, 3. Change the width, 4. Display the area, 5. Display the perimeter");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Your length is "+length);
				System.out.println("Your width is "+width);
				break;
			case 2:
				System.out.println("What do you want your length to be?");
				length = input.nextInt();
				break;
			case 3:
				System.out.println("What do you want your width to be?");
				width = input.nextInt();
				break;
			case 4:
				System.out.println("Your area is "+length*width);
				break;
			case 5:
				System.out.println("Your perimeter is "+length*2+width*2);
				break;
			default:
				System.out.println("pick one stupid");
		}
		i++;
		}
	}

}
