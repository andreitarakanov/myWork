package decisionStructure;
import java.util.Scanner;
public class ActivitesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		System.out.println("How old are you?");
		age = input.nextInt();
		if(age>=18)
		{
			System.out.println("you will be charged as an adult");
		}else {
			System.out.println("your not 18 years old");
		}
		int height;
		int size;
		System.out.println("How tall are you?");
		height = input.nextInt();
		System.out.println("What is your shoe size?");
		size = input.nextInt();
		if(height<62&&size>9)
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		int pets;
		int cars;
		System.out.println("How many pets do you have?");
		pets = input.nextInt();
		System.out.println("How many cars can you fit in your garage?");
		cars = input.nextInt();
		if(pets>=5||cars>3)
		{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		int magicnumber=7;
		System.out.println("Whats the magic number?");
		int mynumber = input.nextInt();
		if(magicnumber==mynumber)
		{
			System.out.println("Your insane");
		}else {
			System.out.println("You didnt guess it");
		}
		
		
	}

}
