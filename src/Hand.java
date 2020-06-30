
public class Hand {
	private Card[] theHand;
	private int counter = 0;
	private int handCounter = 0;
	
	public Hand() {
		theHand = new Card[52];
	}
	public void Draw(Card card) {
		Card temp = card;
		theHand[counter] = temp;
		counter++;
	}
	public void Draw2(Card card) {
		Card temp = card;
		theHand[handCounter] = temp;
		handCounter++;
		System.out.println(handCounter);
	}
	public Card handDraw() {
		Card card = theHand[handCounter];
		theHand[handCounter] = null;
		handCounter--;
		return card;
	}
	public int getHandNumber() {
		if(theHand[counter-1].getNumber() > 10) {
			return 10;
		}
		int handNumber = theHand[counter-1].getNumber();
		return handNumber;
	}
	public int getWarHandNumber() {
		if(theHand[handCounter].getNumber() == 1) {
			return 14;
		}
		int handNumber = theHand[handCounter].getNumber();
		return handNumber;
	}
	public String getWarHandSuit() {
		String handSuit = theHand[handCounter].getSuit();	
		return handSuit;
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

