package breakreview;
public class Rectangle {
//instance field(s)   
	private double length;
	private double width;

	// constructor(s)
	public Rectangle() {
		length = 10;
		width = 5;
	}

	public Rectangle(double xLength, double xWidth) {
		if (xLength > 0 && xWidth > 0) {
			length = xLength;
			width = xWidth;
		}

	}

//Accessor Methods
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		return 2 * length + 2 * width;
	}

	public double area() {
		return length * width;
	}

//Mutator methods
	public void setLength(double xLength) {
		if(xLength>0) {
			length = xLength;
		}
	}

	public void setWidth(double xWidth) {
		if(xWidth>0) {
			width = xWidth;
		}
	}

}