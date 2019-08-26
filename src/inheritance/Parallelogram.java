package inheritance;

public class Parallelogram extends Quadrilateral {

	private double Height;

	public Parallelogram() {
		super();
		Height = 4;
	}
	public String toString() {
		return "cool gaming type = parallelogram" +super.toString();
	}
	public Parallelogram(double l, double w, double h) {
		super(l, w, l, w);
		Height = h;
	}

	public double getHeight() {
		return Height;
	}

	public double getArea() {
		return super.get2() * Height;
	}

}