package strings;
import java.util.Scanner;
public class PrimitiveSthenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		int age = input.nextInt();
		
		input.nextLine();
		System.out.println("First and last name?");
		String name = input.nextLine();
		
		
		System.out.println(name.charAt(0)+" "+name.charAt(2)+" "+name);
	}

}
