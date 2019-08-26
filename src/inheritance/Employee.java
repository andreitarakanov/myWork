package inheritance;

import java.util.Random;

public class Employee {
	private String name;
	private double rate;
	double[] arr = new double[52];
	private static int employeeClassNumber = 0;
	private int employeeNumber = 0;
	
	public Employee(){
		name = "John Smith";
		rate = 10;
		Random rand = new Random();
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = 0+rand.nextDouble()*40;
		}
		employeeNumber = employeeClassNumber;
		employeeClassNumber++;
	}
	
	public void modifyRate(double x) {
		if(x>=0)
		{
			rate+=x;
		}else {
			System.out.println("You did not input correctly");
		}
		
	}
	
	public double calcPay(int x) {
		if(x<0||x>52)
		{
			System.out.println("Wrong input");
		}
		return arr[x]*rate;
	}
	
}
