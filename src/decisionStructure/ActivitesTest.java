package decisionStructure;
import java.util.Scanner;
public class ActivitesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("How old are you?");
		age = input.nextInt();
		if(age==16)
		{
			System.out.println("your 16 years old");
		}else {
			System.out.println("your not 16 years old");
		}
		int height;
		int size;
		System.out.println("How tall are you?");
		height = input.nextInt();
		System.out.println("What is your shoe size?");
		
		size = input.nextInt();
		if(height+size>=26)
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
