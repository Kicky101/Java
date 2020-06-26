import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to play Blackjack: ");
			String start = scan.next();
			if(start.toLowerCase().equals("yes")) {
				Deck theDeck = new Deck();
				Hand theHand = new Hand();
				Hand theDealer = new Hand();
				theDeck.shuffle();
				int limit = 0;
				int dealLimit = 0;
				boolean loopOne = true;
				theDealer.Draw(theDeck.Draw());
				dealLimit = dealLimit + theDealer.getHandNumber();
				theHand.Draw(theDeck.Draw());
				limit = limit + theHand.getHandNumber();
				theHand.Draw(theDeck.Draw());
				limit = limit + theHand.getHandNumber();
				System.out.println("");
				System.out.println("The Dealer's revealed card is:");
				System.out.println("");
				System.out.println(theDealer);
				theDealer.Draw(theDeck.Draw());
				dealLimit = dealLimit + theDealer.getHandNumber();
				while(loopOne) {
					System.out.println("Your hand is:");
					System.out.println("");
					System.out.println(theHand);
					System.out.print("Do you want to hit or stand: ");
					String hitOrStand = scan.next();
					if(hitOrStand.toLowerCase().equals("hit")) {
						theHand.Draw(theDeck.Draw());
						limit = limit + theHand.getHandNumber();
						if(dealLimit < 16) {
							theDealer.Draw(theDeck.Draw());
							dealLimit = dealLimit + theDealer.getHandNumber();
						}
						System.out.println("");
						loopOne = true;
						if(limit > 21) {
							System.out.println("Your hand is:");
							System.out.println("");
							System.out.println(theHand);
							System.out.println("The Dealer's hand is:");
							System.out.println("");
							System.out.println(theDealer);
							System.out.println("You're bust, with a score of " + limit);
							System.out.println("The Dealer wins");
							System.out.println("");
							loopOne = false;
						}
						if(dealLimit > 21) {
							System.out.println("Your hand is:");
							System.out.println("");
							System.out.println(theHand);
							System.out.println("");
							System.out.println("The Dealer's hand is:");
							System.out.println("");
							System.out.println(theDealer);
							System.out.println("");
							System.out.println("The Dealer is bust with a score of " + dealLimit);
							System.out.println("You win");
						}
					}
					else if(hitOrStand.toLowerCase().equals("stand")) {
						System.out.println("");
						System.out.println("Your hand is:");
						System.out.println("");
						System.out.println(theHand);
						System.out.println("The Dealer's hand is:");
						System.out.println("");
						System.out.println(theDealer);
						if(dealLimit < limit) {
							System.out.println("You scored " + limit + ", higher than The Dealer's score of " + dealLimit);
							System.out.println("You win");
						}
						else if(limit < dealLimit) {
							System.out.println("You scored " + limit + ", lower than The Dealer's score of " + dealLimit);
							System.out.println("You lose");
						}
						System.out.println("");
						loopOne = false;
					}
					else {
						System.out.println("");
						loopOne = true;
					}
				}
			}
			else if(start.toLowerCase().equals("no")) {
				loop = false;
			}
			else {
				System.out.println("");
				loop = true;
			}
		}
		scan.close();
	}
}
