
public class Hand {
	private Card[] theHand;
	private int counter = 0;
	private int handCounter = 0;
	private int drawCounter = 0;
	
	public Hand() {
		theHand = new Card[52];
	}
	public void Draw(Card card) {
		Card temp = card;
		theHand[counter] = temp;
		counter++;
	}
	public void Repeat() {
		if(theHand[handCounter + 1] == null) {
			
		}
	}
	public void Draw2(Card card) {
		Card temp = card;
		theHand[handCounter] = temp;
		handCounter++;
		if(handCounter == 52) {
			handCounter = 0;
		}
	}
	public Card handDraw() {
		Card card = theHand[drawCounter];
		theHand[drawCounter] = null;
		drawCounter++;
		if(drawCounter == 52) {
			drawCounter = 0;
		}
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
		if(theHand[drawCounter].getNumber() == 1) {
			return 14;
		}
		int handNumber = theHand[drawCounter].getNumber();
		return handNumber;
	}
	public String getWarHandSuit() {
		String handSuit = theHand[drawCounter].getSuit();	
		return handSuit;
	}
	public boolean warWin() {
		return drawCounter == handCounter;
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

