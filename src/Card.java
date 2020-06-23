
public class Card {
	private String suit;
	private int number;
	public Card(String s, int n) {
		suit = s;
		number = n;
	}
	public String getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	public void setSuit(String y) {
		suit = y;
	}
	public void setNumber(int x) {
		number = x;
	}
	public String toString() {
		String temp = "";
		if(suit.equals("Clubs") || suit.equals("Spades") || suit.equals("Diamonds") || suit.equals ("Hearts")) {
			if(number == 1) {
				temp = "Ace of " + suit;
			}
			else if(number == 11) {
				temp = "Jack of " + suit;
			}
			else if(number == 12) {
				temp = "Queen of " + suit;
			}
			else if(number == 13) {
				temp = "King of " + suit;
			}
			else if(number > 13) {
				temp = "What are you trying to pull?";
			}
			else {
				temp =  number + " of " + suit;
			}
		}
		else {
			temp = "What are you trying to pull?";
		}
		return temp;
	}
}
