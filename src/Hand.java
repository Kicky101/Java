
public class Hand {
	private Card[] theHand;
	private int counter = 0;
	private int rightHandCounter = 0;
	private int leftHandCounter = 0;
	public Hand() {
		theHand = new Card[52];
	}
	public void Draw(Card card) {
		Card temp = card;
		theHand[counter] = temp;
		counter++;
	}
	public void rightHandDraw() {
		Card card = theHand[leftHandCounter];
		theHand[rightHandCounter + 26] = card;
		theHand[leftHandCounter] = null;
		rightHandCounter++;
	}
	
	//public Card Draw() {
		//Card card = theDeck[counter];
		//theDeck[counter] = null;
		//counter++;
		//return card;
	//}
	
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

