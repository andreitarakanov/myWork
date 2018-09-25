package inputExamples;

import java.util.Scanner;

public class PasswordCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me three 1 digit integers on seperate lines");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		System.out.println("Possible combintations for your password: ");
		System.out.println(num1+""+num2+""+num3);
		System.out.println(num1+""+num3+""+num2);
		System.out.println(num2+""+num1+""+num3);
		System.out.println(num2+""+num3+""+num1);
		System.out.println(num3+""+num1+""+num2);
		System.out.println(num3+""+num2+""+num1);
		input.close();
	}

}
