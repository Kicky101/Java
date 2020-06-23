public class cardTest {
	public static void main(String[] args) {
		Card deck = new Card("s", 2);
		
		System.out.println(deck.getSuit());
		
		System.out.println(deck.getNumber());
		
		System.out.println(deck);
	}
}
