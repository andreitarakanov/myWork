package inputExamples;
import java.util.Scanner;
public class VotingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Did you vote? True or false");
		boolean result = input.nextBoolean();
		if(result==false)
		{
			System.out.println("You didnt vote");
		} else {
			System.out.println("You voted :)");
		}
	}

}
