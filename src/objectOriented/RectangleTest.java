package objectOriented;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.changeLength(2);
		rect.changeWidth(2);
		double length = rect.returnLength();
		double width = rect.returnWidth();
		double area = rect.area();
		double peri = rect.perimeter();
		System.out.println("The length is "+length);
		System.out.println("The width is "+width);
		System.out.println("The area is "+area);
		System.out.println("The perimeter is "+peri);
	}

}
