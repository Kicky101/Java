import java.util.Random;

public class Deck {
	private Card[] theDeck;
	public Deck() {
		theDeck = new Card[52];
		int x = 0;
		for(int i = 1; i<theDeck.length/4+1; i++) {
			theDeck[x] = new Card("Spades", i);
			x++;
			theDeck[x] = new Card("Hearts", i);
			x++;
			theDeck[x] = new Card("Clubs", i);
			x++;
			theDeck[x] = new Card("Diamonds", i);
			x++;
		}
	}
	public String toString() {
		String temp = "";
		for(int i = 0; i<theDeck.length; i++) {
			if(theDeck[i] != null) {
				temp+=theDeck[i]+"\n";
			}
		}
		return temp;
	}
	public void shuffle() {
		Random rand = new Random();
		for(int i = 0; i<1000; i++) {
			int x = rand.nextInt(theDeck.length);
			int y = rand.nextInt(theDeck.length);
			Card temp = theDeck[x];
			theDeck[x] = theDeck[y];
			theDeck[y] = temp;
        }
	}
	int counter = 0;
	public Card Draw() {
		Card card = theDeck[counter];
		theDeck[counter] = null;
		counter++;
		return card;
	}
}
