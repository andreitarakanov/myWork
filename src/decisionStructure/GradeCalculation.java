package decisionStructure;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testaverage = input.nextDouble();
		System.out.println("What is your homework average?");
		double homework = input.nextDouble();
		System.out.println("Is your teacher nice?");
		String teachernice = input.nextLine();
		int testlarger;
		if(testaverage>homework)
		{
			testlarger = 1;
		}
		else
		{
			testlarger = 0;
		}
		if(teachernice == "yes"||teachernice == "Yes"||teachernice == "YES")
		{
			System.out.println("You have a grade of "+testaverage);
		}
		else
		{
			System.out.println("You have a grade of "+homework);
		}
		
	}

}
