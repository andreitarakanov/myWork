package inputExamples;

import java.util.Scanner;

public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the first number in your locker combo?");
		int firstNum = input.nextInt();
		System.out.println("Whats the second number in your locker combo?");
		int secondNum = input.nextInt();
		System.out.println("Whats the third number in your locker combo?");
		int thirdNum = input.nextInt();
		System.out.println(firstNum+" - "+secondNum+" - "+thirdNum);
	}

}
