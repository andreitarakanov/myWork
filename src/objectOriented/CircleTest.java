package objectOriented;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circl = new Circle();
		circl.changeRadius(2);
		double circ = circl.circumference();
		double area = circl.area();
		System.out.println("The circumference is "+circ);
		System.out.println("The area is "+area);
		
		
	}

}
