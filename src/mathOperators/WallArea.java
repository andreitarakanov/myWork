package mathOperators;
import java.math.*;
import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int wallH = 96;
		int wallL = 0;
		int wallA = 0;
		System.out.println("Whats the length of your wall(in inches)?");
		wallL = input.nextInt();
		wallA = wallH*wallL;
		System.out.println("Your wall "+wallH+"x"+wallL+" has an area of "+wallA+" inches squared or "+Math.round((wallA-0.5)/12)+" feet and "+wallA%Math.round((wallA-0.5)/12)+" inches");
		input.close();
	}

}
