package objectOriented;
import java.util.*;
public class ShapeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the length and height of your rectangle?");
		double lengthR = input.nextDouble();
		double heightR = input.nextDouble();
		Rectangle rect = new Rectangle(lengthR,heightR);
		System.out.println("The area of this is "+rect.area());
		System.out.println("The perimeter of this is "+k;
		
		System.out.println("Whats the radiu of your circle?");
		double radius = input.nextDouble();
		Circle circ = new Circle(radius);
		
		System.out.println("Whats the base and height of your triangle?");
		double baseT = input.nextDouble();
		double heightT = input.nextDouble();
		RightTriangle t = new RightTriangle(baseT, heightT);
		
		
		System.out.println("Whats the two bases height and leg your rectangle?");
		double base1T = input.nextDouble();
		double base2T = input.nextDouble();
		double heighT = input.nextDouble();
		double legT = input.nextDouble();
		IsoscelesTriangle it = new IsoscelesTriangle(base1T, base2T, heighT, legT);
		
		
		
		
		
	}

}
