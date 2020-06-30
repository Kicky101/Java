import java.util.Scanner;

// This is a funny WIP

public class War {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to witness War, Conquest, Famine, and Death: ");
			String start = scan.next();
			if(start.toLowerCase().equals("yes")) {
				Deck theDeck = new Deck();
				Hand rightHand = new Hand();
				Hand leftHand = new Hand();
				Hand warHand = new Hand();
				theDeck.shuffle();
				for(int i = 0; i < 26; i++) {
					rightHand.Draw2(theDeck.Draw());
					leftHand.Draw2(theDeck.Draw());
				}
				System.out.println(rightHand);
				System.out.println("");
				System.out.println(leftHand);
				boolean loopOne = true;
				while(loopOne) {
					
					// Order
					// 1. Print the first card of each players hand
					// 2. Get the number of each card
					// 3. Find out which card has the higher number
					// 4. Find out which player was the one who gave the card with the higher number
					// 5. Return both cards to the players hands
					// Repeat
					
					String rightHandSuit = rightHand.getWarHandSuit();
					String leftHandSuit = leftHand.getWarHandSuit();
					int rightHandNumber = rightHand.getWarHandNumber();
					int leftHandNumber = leftHand.getWarHandNumber();
					
					if(rightHandNumber == 11) {
						System.out.println("Right hand drew the Jack of " + rightHandSuit); 
					}
					else if(rightHandNumber == 12) {
						System.out.println("Right hand drew the Queen of " + rightHandSuit); 
					}
					else if(rightHandNumber == 13) {
						System.out.println("Right hand drew the King of " + rightHandSuit); 
					}
					else if(rightHandNumber == 14) {
						System.out.println("Right hand drew the Ace of " + rightHandSuit); 
					}
					else {
						System.out.println("Right hand drew " + rightHandNumber + " of " + rightHandSuit); 
					}
					
					if(leftHandNumber == 11) {
						System.out.println("Right hand drew the Jack of " + leftHandSuit); 
					}
					else if(leftHandNumber == 12) {
						System.out.println("Right hand drew the Queen of " + leftHandSuit); 
					}
					else if(leftHandNumber == 13) {
						System.out.println("Right hand drew the King of " + leftHandSuit); 
					}
					else if(leftHandNumber == 14) {
						System.out.println("Right hand drew the Ace of " + leftHandSuit); 
					}
					else {
						System.out.println("Right hand drew " + leftHandNumber + " of " + leftHandSuit); 
					}
					
					if(rightHandNumber < leftHandNumber) {
						leftHand.Draw2(rightHand.handDraw());
						for(int i = 0; i < 26; i++) {
							rightHand.Draw2(warHand.handDraw());
						}
						loop = false;
					}
					if(leftHandNumber < rightHandNumber) {
						rightHand.Draw2(leftHand.handDraw());
						for(int i = 0; i < 26; i++) {
							leftHand.Draw2(warHand.handDraw());
						}
						loop = false;
					}
					if(rightHandNumber == leftHandNumber) {
						warHand.Draw2(rightHand.handDraw());
						warHand.Draw2(leftHand.handDraw());
						loop = false;
					}
				}
			}
			else if(start.toLowerCase().equals("no")) {
				System.out.println("");
				System.out.println("Good Choice");
				loop = false;
			}
			else {
				System.out.println("");
			}
		}
		scan.close();
	}
}
