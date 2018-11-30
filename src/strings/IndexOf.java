package strings;
import java.util.Scanner;
public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me sentance");
		String sentence = input.nextLine();
		int cool = sentence.indexOf("x");
		System.out.println("Found at location "+cool);
	}

}
