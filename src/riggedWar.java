import java.util.Scanner;

public class riggedWar {
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
				int warCheck = 0;
				int warCounter = 0;
				int turnCounter = 0;
				boolean loopOne = true;
				System.out.println("");
				System.out.println(rightHand);
				System.out.println("");
				System.out.println(leftHand);
				while(loopOne) {
					
					if (turnCounter == 1000000000) {
						System.out.println("Get a life");
						System.out.println("");
						break;
					}
					
					// Order
					// 1. Print the first card of each players hand
					// 2. Get the number of each card
					// 3. Find out which card has the higher number
					// 4. Find out which player was the one who gave the card with the higher number
					// 5. Return both cards to the players hands
					// 6. Win command
					// Repeat
					
					if(rightHand.warWin())  {
						System.out.println("");
						System.out.println("Left hand wins?");
						System.out.println("");
						rightHand.Draw2(leftHand.handDraw());
						rightHand.Draw2(leftHand.handDraw());
						rightHand.Draw2(leftHand.handDraw());
						rightHand.Draw2(leftHand.handDraw());
						rightHand.Draw2(leftHand.handDraw());
					}
					if(leftHand.warWin())  {
						System.out.println("");
						System.out.println("Right hand wins?");
						System.out.println("");
						leftHand.Draw2(rightHand.handDraw());
						leftHand.Draw2(rightHand.handDraw());
						leftHand.Draw2(rightHand.handDraw());
						leftHand.Draw2(rightHand.handDraw());
						leftHand.Draw2(rightHand.handDraw());
					}
					
					String rightHandSuit = rightHand.getWarHandSuit();
					String leftHandSuit = leftHand.getWarHandSuit();
					int rightHandNumber = rightHand.getWarHandNumber();
					int leftHandNumber = leftHand.getWarHandNumber();
					turnCounter++;
					System.out.println("Turn: " + turnCounter);
					System.out.println("");
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
						System.out.println("Left hand drew the Jack of " + leftHandSuit); 
					}
					else if(leftHandNumber == 12) {
						System.out.println("Left hand drew the Queen of " + leftHandSuit); 
					}
					else if(leftHandNumber == 13) {
						System.out.println("Left hand drew the King of " + leftHandSuit); 
					}
					else if(leftHandNumber == 14) {
						System.out.println("Left hand drew the Ace of " + leftHandSuit); 
					}
					else {
						System.out.println("Left hand drew " + leftHandNumber + " of " + leftHandSuit); 
					}
					
					if(rightHandNumber < leftHandNumber) {
						leftHand.Draw2(rightHand.handDraw());
						leftHand.Draw2(leftHand.handDraw());
						System.out.println("");
						if(warCheck == 1) {
							for(int i = 0; i < warCounter; i++) {
								leftHand.Draw2(warHand.handDraw());
							}
							warCounter = 0;
							warCheck = 0;
						}
					}
					if(leftHandNumber < rightHandNumber) {
						rightHand.Draw2(leftHand.handDraw());
						rightHand.Draw2(rightHand.handDraw());
						System.out.println("");
						if(warCheck == 1) {
							for(int i = 0; i < warCounter; i++) {
								rightHand.Draw2(warHand.handDraw());
							}
							warCounter = 0;
							warCheck = 0;
						}
					}
					if(rightHandNumber == leftHandNumber) {
						for(int i = 0; i < 4; i++) {
							warHand.Draw2(rightHand.handDraw());
							warCounter++;
							if(rightHand.warWin()) {
								break;
							}
						}
						for(int i = 0; i < 4; i++) {
							warHand.Draw2(leftHand.handDraw());
							warCounter++;
							if(leftHand.warWin()) {
								break;
							}
						}
						System.out.println("");
						System.out.println("WAR");
						System.out.println("");
						warCheck = 1;
					}
					try {
						Thread.sleep(0);
					} catch (InterruptedException e) {
						e.printStackTrace();
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

