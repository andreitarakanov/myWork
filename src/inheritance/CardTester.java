package inheritance;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card cool = new Card("2","Spades",1);
		Card notcool = new Card("3","Spades",2);
		System.out.println(cool.toString());
		System.out.println(cool.matches(notcool));
		
		
		
		
		
		
		
		
		
	}
}