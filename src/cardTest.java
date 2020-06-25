public class cardTest {
	public static void main(String[] args) {
		Deck theDeck = new Deck();
		
		Hand theHand = new Hand();
		
		System.out.println(theDeck);
		
		System.out.println(theHand);
		
		theHand.Draw(theDeck.Draw());

		System.out.println(theDeck);
		
		System.out.println(theHand);
	}
}
