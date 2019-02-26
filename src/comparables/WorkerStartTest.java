package comparables;

import java.util.ArrayList;
import java.util.Random;

public class WorkerStartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WorkerStart> workingTime = new ArrayList<WorkerStart>();
		Random rand = new Random();
		double min = 20;
		double max = 40;
		for(int i = 0;i<100;i++)
		{
			
			WorkerStart temp = new WorkerStart(1,min+ rand.nextInt((int) (max-min+1)));
			workingTime.add(temp);
		}
		int largep = 0;
		int smallp = 0;
		double largeamount = workingTime.get(0).getRate();
		double smallamount = workingTime.get(0).getRate();
		
		for(int i = 0;i<99;i++)
		{
			if(workingTime.get(i).compareTo(workingTime.get(largep))==0)
			{
				largeamount = workingTime.get(i).getRate();
				largep = i;
			}
			if(workingTime.get(i).compareTo(workingTime.get(largep))==1)
			{
				largeamount = workingTime.get(largep).compareTo(workingTime.get(largep));
				largep = i;
			}
			if(workingTime.get(i).compareTo(workingTime.get(smallp))==-1)
			{
				largeamount = workingTime.get(smallp).compareTo(workingTime.get(smallp));
				largep = i;
			}
		}
		System.out.println(largep);
		System.out.println(smallp);
		
		System.out.println(largeamount);
		System.out.println(smallamount);
		
	}

}
