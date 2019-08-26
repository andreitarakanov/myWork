package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many employees?");
		int count = input.nextInt();
		ArrayList<Employee> emps = new ArrayList<Employee>();
		for(int i = 0;i<count;i++)
		{
			emps.add(new Employee());
		}
		System.out.println("Dollar raise?");
		double cool = input.nextDouble();
		emps.get(emps.size()-1).modifyRate(cool);
		for(int i = 0;i<emps.size();i++)
		{
			System.out.println("Employee "+(i+1)+" should be paid $"+emps.get(i).calcPay(2));
			
		}
		double pay = 0;
		for(int i =0;i<emps.size();i++)
		{
			for(int j = 0;j<52;j++)
			{
				pay+= emps.get(i).calcPay(j);
			}
		}
		System.out.println("Total amount = $"+pay);
	}

}
