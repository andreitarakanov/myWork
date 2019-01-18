package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import objectOriented.Friend;

public class Algebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		System.out.println("How many student are in your class");
		int students = input.nextInt();
		String temp = null;
		int temps = 0;

		for(int i = 0;i<students;i++)
		{
			System.out.println("What is the name of student "+(i+1));
			temp = input.nextLine();
			System.out.println("What is the score of student "+(i+1));
			temps = input.nextInt();
			Student tempst = new Student(temp,temps);
			arr.add(tempst);
		}
		for(int i = 0;i<students;i++)
		{
			System.out.println(arr.get(i).returnName()+" got a score of "+arr.get(i).returnScore());
		}
		
	}

}
