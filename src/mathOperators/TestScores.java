package mathOperators;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What scores did you get on your three tests?");
		double score1 = input.nextDouble();
		double score2 = input.nextDouble();
		double score3 = input.nextDouble();
		double average = (score1+score2+score3)/3;
		System.out.println("You got an score of "+score1);
		System.out.println("You got an score of "+score2);
		System.out.println("You got an score of "+score3);
		System.out.println("You got an average of "+average);
		input.close();
		
	}

}
