package interfaces;

import java.util.Random;

public class GoldFish implements Fish{
	private double length = 0;
	private int age = 0;
	private String color = "cool";
	public GoldFish(){
		Random rand = new Random();
		length = 10+rand.nextInt(50-10+1);
		age = 1+rand.nextInt(20-1+1);
	}
	public double getLength() {
		return length;
	}
	public String toString() {
		return "Goldfish - Length = "+length+" - age = "+age+" - color = "+color;
	}
	
}
