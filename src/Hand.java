
public class Hand {
	private Card[] theHand;
	private int counter = 0;
	public Hand() {
		theHand = new Card[11];
	}
	public void Draw(Card card) {
		// Could use something like Card temp = theDeck[x], and then turn theDeck[x] to null, while putting temp into the hand
		// Could use setters to set a card's number and suit in the hand, while turning the card into null in the deck (Emergency option)
		// For counter to increase, could use a loop of some sort
		// Find a way to set card to theDeck[1] (setters???)
		// Have to get card from Deck into the card from Hand
		Card temp = card;
		theHand[counter] = temp;
		counter++;
	}
	public int getHandNumber() {
		if(theHand[counter-1].getNumber() > 10) {
			return 10;
		}
		int handNumber = theHand[counter-1].getNumber();
		return handNumber;
	}
	public String toString() {
		String temp = "";
		for(int i = 0; i<theHand.length; i++) {
			if(theHand[i] != null) {
				temp+=theHand[i]+"\n";
			}
		}
		return temp;
	}
}

