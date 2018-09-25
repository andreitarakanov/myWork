package inputExamples;
import java.util.Scanner;
public class BrokenBones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broken in your life?");
		int brokenBones = input.nextInt();
		System.out.println("You have broken "+brokenBones+" bone(s) in your lifetime.");
	}

}
