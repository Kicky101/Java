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
				theDeck.shuffle();
				for(int i = 0; i < 26; i++) {
					rightHand.Draw(theDeck.Draw());
					leftHand.Draw(theDeck.Draw());
				}
				boolean loopOne = true;
				while(loopOne) {
					
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
