package loops;

public class NestedActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double highestfactors= 0;
		double highest = 0;
		for (int j = 1; j < 1000; j++) {
			sum=0;
			for (double i = j; i > 0; i--) {
				if (j / i - Math.floor(j / i) == 0) {
					//System.out.println(j/i);
					sum++;
				}
				
			}
			if(sum>= highestfactors)
			{
				highestfactors = sum;
				highest = j;
			}
			//System.out.println("The number of factors in "+j+" is "+sum);
			
		}
		System.out.println("The highest factoriest is "+highest);
	}

}
