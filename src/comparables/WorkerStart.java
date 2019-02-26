package comparables;  

public class WorkerStart implements Comparable<WorkerStart>{
	private int hours;
	private double rate;

	//constructor(s)
	public WorkerStart(){
	hours = 40;
	rate = 3.50;
	}
	
	public int compareTo(WorkerStart xWorker) {
		if(Math.abs(this.rate-xWorker.getRate())<0.00001) {
			return 0;
		}
		if(this.rate<xWorker.getRate()) {
			return -1;
		}
		return 1; 
		
	}
		
	public WorkerStart(int newHours, double newRate){
	hours = newHours;
	rate = newRate;
	}

	public int getHours(){
		return hours;
	}

	public void setHours(int xHours){
		hours = xHours;
	}

	public double getRate(){
		return rate;
	}

	public void setRate(double xRate){
		rate = xRate;
	}

	public double payCheck(){
		return hours * rate;
	}

	public void raise(double amount){
			rate = rate + amount;
	}
}
