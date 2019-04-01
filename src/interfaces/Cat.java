package interfaces;

public class Cat implements Animal{
	private String name = "gamer";
	private int age = 3;
	private Boolean friendly = true;
	
	public void act() {
		age+=9;
		if(friendly==true) {
			friendly = false;
		} else {
			friendly = true;
		}
		
	}
	public String toString() {
		return "Name of cat: "+name+" age is: "+age+" friendly is: "+friendly;
	}
	
	public Boolean getFriendly() {
		return friendly;
	}
}
