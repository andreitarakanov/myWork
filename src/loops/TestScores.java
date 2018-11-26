package loops;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many students do you have?");
		int stud = input.nextInt();
		int sum = 0;
		for(int i = 0; i<stud;i++)
		{
			System.out.println("What is one test score "+i+"/"+stud);
			
		}
		int average = 0;
	}

}
