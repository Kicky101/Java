import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		Deck theDeck = new Deck();
		Hand theHand = new Hand();
		Hand theDealer = new Hand();
		while(loop) {
			System.out.print("Do you want to play Blackjack: ");
			String start = scan.next();
			if(start.toLowerCase().equals("yes")) {
				theDeck.shuffle();
				int limit = 0;
				int dealLimit = 0;
				boolean loopOne = true;
				theDealer.Draw(theDeck.Draw());
				dealLimit = dealLimit + theDealer.getHandNumber();
				theHand.Draw(theDeck.Draw());
				theHand.Draw(theDeck.Draw());
				System.out.println("");
				System.out.println("The dealer's revealed card is:");
				System.out.println("");
				System.out.println(theDealer);
				theDealer.Draw(theDeck.Draw());
				dealLimit = dealLimit + theDealer.getHandNumber();
				while(loopOne) {
					System.out.println("Your hand is:");
					System.out.println("");
					System.out.println(theHand);
					if(limit > 21) {
						System.out.println("You're bust");
						System.out.println("Dealer wins");
						System.out.println("");
						loopOne = false;
					}
					System.out.print("Do you want to hit or stand: ");
					String hitOrStand = scan.next();
					if(hitOrStand.toLowerCase().equals("hit")) {
						theHand.Draw(theDeck.Draw());
						limit = limit + theHand.getHandNumber();
						if(dealLimit < 16) {
							theDealer.Draw(theDeck.Draw());
							dealLimit = dealLimit + theDealer.getHandNumber();
						}
						loopOne = true;
					}
					else if(hitOrStand.toLowerCase().equals("stand")) {
						System.out.println("");
						System.out.println("Your hand is:");
						System.out.println(theHand);
						System.out.println("");
						System.out.println("The dealer's revealed card is:");
						System.out.println("");
						System.out.println(theDealer);
						if(dealLimit > 21) {
							System.out.println("The Dealer is bust");
							System.out.println("You win");
						}
						else if(dealLimit < limit) {
							System.out.println("You scored higher than the dealer");
						}
						loopOne = false;
					}
					else {
						loopOne = true;
					}
				}
			}
			else if(start.toLowerCase().equals("no")) {
				loop = false;
			}
			else {
				loop = true;
			}
		}
		scan.close();
	}
}
