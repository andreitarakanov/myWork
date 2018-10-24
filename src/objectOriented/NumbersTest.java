package objectOriented;
import java.util.Scanner;
public class NumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Numbers number = new Numbers();
		System.out.println("What number is your base?");
		double input1 = input.nextDouble();
		double output1 = number.returnSquare(input1);
		System.out.println(output1);
		System.out.println("What is your length and width?");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double area = number.returnArea(length, width);
		System.out.println(area);
		System.out.println("What do you want to round up?");
		double rounder = input.nextDouble();
		double answer = number.returnRoundUp(rounder);
		System.out.println(answer);
	}

}
