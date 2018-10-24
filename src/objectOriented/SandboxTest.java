package objectOriented;
import java.util.Scanner;
public class SandboxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start of the first version
		System.out.println("Start of the first version");
		Scanner input = new Scanner(System.in);
		Sandbox sand = new Sandbox();
		sand.sandboxFiller1();
		
		//Start of the second version
		System.out.println("Start of the second version");
		System.out.println("What is the length width and depth of your sandbox in feet?");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double depth = input.nextDouble();
		System.out.println("At what rate do you transport sand in cubic feet?");
		double rate = input.nextDouble();
		sand.sandboxFiller2(length, width, depth, rate);
		
		
		System.out.println("Start of the third version");
		//Start of the third version
		System.out.println("What is the length width and depth of your sandbox in feet?");
		double length1 = input.nextDouble();
		double width1 = input.nextDouble();
		double depth1 = input.nextDouble();
		System.out.println("At what rate do you transport sand in cubic feet?");
		double rate1 = input.nextDouble();
		double answer = sand.sandboxFiller3(length1, width1, depth1, rate1);
		System.out.println(answer);
	}

}
