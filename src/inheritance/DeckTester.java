package inheritance;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suits = {"Clubs","Spades","Hearts","Diamonds"};
		int[] values = {2, 3,4,5,6,7,8,9,10,10,10,10,11};
		Deck bob = new Deck(ranks, suits, values);
		System.out.println(bob.toString());
		for(int i = 0;i<values.length;i++)
		{
			System.out.println(bob);
		}
	}  
}
