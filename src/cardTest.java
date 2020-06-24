public class cardTest {
	public static void main(String[] args) {
		Card deck = new Card("Clubs", 12);
		
		System.out.println(deck.getSuit());
		
		System.out.println(deck.getNumber());
		
		System.out.println(deck);
		
		System.out.println("");
		
		Deck theDeck = new Deck();
		
		System.out.println(theDeck);
	}
}
