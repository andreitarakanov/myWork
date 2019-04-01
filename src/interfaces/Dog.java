package interfaces;

import java.util.Random;

public class Dog implements Animal{
	private String name = "cool";
	private int age = 2;
	private Boolean injured = false;

	public void act() {
		injured = false;
		age += 7;
		Random rand = new Random();
		if (rand.nextInt(50 - 0 + 1) < 1) {
			injured = true;
		}

	}
	public String toString() {
		return "Name of dog: "+name+" age is: "+age+" injured is: "+injured;
	}
	public void vet() {
		injured = false;
	}
}
