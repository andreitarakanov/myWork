package inputExamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height;
		System.out.println("Do you know what the height of an adult monkey is in inches?");
		height = input.nextInt();
		if(height<12)
		{
			System.out.println("Your kinda dumb you thought he would be "+height+" inches");
		} else {
			System.out.println("Your guess was "+height+" inches tall...");
		}
		
	}

}
