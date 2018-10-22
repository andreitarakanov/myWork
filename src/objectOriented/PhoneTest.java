package objectOriented;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone bob = new Phone(2624448155D, 2623099166D);
		bob.makeCall(2624448155D, 12);
		System.out.println("You last made a call to "+Math.round(bob.getLastNum()));
		System.out.println("You have talked for a total of "+Math.round(bob.minutes())+" minutes.");
		System.out.println("Would you like to call "+Math.round(bob.speedDial())+" on your speed dial.");
		bob.makeCall(2623092186D, 76);
		System.out.println("You last made a call to "+Math.round(bob.getLastNum()));
		System.out.println("You have talked for a total of "+Math.round(bob.minutes())+" minutes.");
		System.out.println("Would you like to call "+Math.round(bob.speedDial())+" on your speed dial.");
	}

}
