package decisionStructure;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double epsilon = 0.00000000000000001;
		Scanner input = new Scanner(System.in);
		System.out.println("Whats your gpa?");
		double gpa = input.nextDouble();
		final double reqgpa = 3.5;
		System.out.println("Whats your grade?");
		int grade = input.nextInt();
		if( grade==12 && Math.abs(gpa-reqgpa)<epsilon || gpa>3.5)
		{
			System.out.println("You can graduate with honors");
		}
		else
		{
			System.out.println("You cant graduate with honors");
		}
	}

}
