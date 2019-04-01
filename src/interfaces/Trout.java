package interfaces;

import java.util.Random;

public class Trout implements Fish{
	private double length = 0;
	private int age = 0;
	private double numScales = 0;
	public Trout() {
		Random rand = new Random();
		length = 10+rand.nextInt(50-10+1);
		age = 1+rand.nextInt(20-1+1);
		numScales = 25+rand.nextInt(50-25+1);
	}
	public double getLength() {
		return length;
	}
	public String toString() {
		return "Trout - Length = "+length+" - Age = "+age+" - Number of scales  = "+numScales;
	}
	
}
