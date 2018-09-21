package outputExamples;
import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1;
		double num2;
		double answer;
		System.out.println("First number = ");
		num1 = input.nextDouble();
		System.out.println("Second number = ");
		num2 = input.nextDouble();
		answer = num1 *num2;
		System.out.println("Your answer is: "+answer);
	}

}
