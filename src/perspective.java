import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class perspective {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("O V E R R A T E D   R P G   G A M E");
		boolean titleLoop = true;
		boolean startGame = false;
		while(titleLoop) {
			System.out.print("Type START to start the game, OPTIONS to open the options menu, or EXIT to exit the game: ");
			String titleCommand = scan.next();
			if(titleCommand.toLowerCase().equals("options")) {
				while(true) {
					System.out.println();
					System.out.println("Back to Menu Mode - OFF");
					for(int i = 0; i<6; i++) {
						System.out.println("Null - OFF");
					}
					System.out.println();
					System.out.println("");
					System.out.print("Do you want to turn Back to Menu Mode on: ");
					String backToTitle = scan.next();
					if(backToTitle.toLowerCase().equals("no")) {
						continue;
					}
					else if(backToTitle.toLowerCase().equals("yes")) {
						System.out.println();
						break;
					}
					else {
						System.out.println("Interpreting vague answer as 'no'");
						continue;
					}
				}
			}
			else if(titleCommand.toLowerCase().equals("exit")) {
				break;
			}
			else if(titleCommand.toLowerCase().equals("start")) {
				startGame = true;
				break;
			}
			else {
				System.out.println("Excuse me?");
			}
		}
		int recklessness = 0;
		int nature = 0;
		if(startGame) {
			System.out.println("PROLOUGE");
			System.out.println("You wake up in your bed like any other day, bored as hell");
			System.out.println("You walk over to your closet to find something to do");
			System.out.println("In it you find an old Gamechild, the screen is cracked");
			System.out.println("You boot it up and it opens to Tic Tac Toe");
			System.out.print("Do you play the game or not: ");
			String playTicTacToe = scan.next();
			if(playTicTacToe.toLowerCase().equals("yes")) {
				badTicTacToe.main(new String[0]);
				System.out.println("The game appears to have crashed");
				System.out.println("You put down the broken console and walk away");
			}
			else if(playTicTacToe.toLowerCase().equals("no")) {
				System.out.println("You put the console down and walk away");
			}
			else {
				System.out.println("You fail to decide and end up putting the console down");
			}
			System.out.println("You decide that that's enough games for today and go to the kitchen for some cereal");
			System.out.println("When you open up the cabinet you see two delicious cereals");
			System.out.print("Do you eat Ronald's Puffs or Beerios: ");
			String cereal = "";
			if (scan.hasNext()) {
				if (scan.hasNextLine()) {
					cereal = scan.nextLine();
				}
			}
			if(cereal.toLowerCase().equals("beerios")) {
				System.out.println("You make the reckless decision of consuming alcohol coated cereal in the morning");
				System.out.println();
				System.out.println("+1 recklessnes!");
				recklessness = recklessness + 1;
				System.out.println();
				System.out.println("You pour your Beerios into the bowl and go to the fridge to get milk");
			}
			else if(cereal.toLowerCase().equals("beerios")) {
				System.out.println("You make the well balanced decision of eating a tasty cereal in the morning");
				System.out.println("You pour your Ronald's Puffs into the bowl and go to the fridge to get milk");
			}
			else {
				System.out.println("You fail to decide and move your hand towards a random ceareal box");
				System.out.println("You grab Ronald's Puffs");
				System.out.println("You pour your Ronald's Puffs into the bowl and go to the fridge to get milk");
			}
			System.out.println("But, a deep feeling of dread surrounds you");
			System.out.println("...");
			System.out.println("You're out of milk");
			System.out.println("...");
			System.out.println("So you decide to go to the store to get more");
			System.out.println();
			System.out.println("On your way to the store you pass a woman walking a dog");
			System.out.print("Do you pet the dog or not: ");
			String petDog = "";
			if (scan.hasNext()) {
				scan.nextLine();
				if (scan.hasNextLine()) {
					petDog = scan.nextLine();
				}
			}
			if(petDog.toLowerCase().equals("no")) {
				System.out.println("You keep walking");
			}
			else if(petDog.toLowerCase().equals("yes")) {
				System.out.println("You stop and pet the dog");
				System.out.println();
				System.out.println("+2 nature!");
				nature = nature + 2;
				System.out.println();
			}
			else {
				System.out.println("You fail to decide and end up walking away");
			}
			System.out.println("When you're about 50 meters away from the grocery store, you here a rumbling and the ground beneath you begins to shake");
			System.out.println("You drop to the floor, thinking its an earthquake");
			System.out.println("But the ground beneath you falls");
			System.out.println("It was a sinkhole!");
			System.out.println("And its a long way down");
			System.out.println("You land in an ice pond and blackout");
			System.out.println("PROLOUGE COMPLETE");
			try{
				System.out.print("Press Enter to continue...");
				System.in.read();
			}
			catch(Exception e){	
				e.printStackTrace();
			}
			for(int i=0; i<10; i++) {
				System.out.println();
			}
			System.out.println("CHAPTER ONE");
			System.out.println("You slowly open your eyes to see random chunks of ice scattered about in a hole you're in");
			System.out.println("You're in a puddle, knee deep");
			System.out.println("You see another person passed out");
			System.out.println("In a panic you run over to him and shake him awake");
			System.out.println("His eyes slowly open");
			String p1Line1 = "";
			while(true) {
				System.out.print("Does Player 2 say 'Who are you?'(1) or 'Just 5 more minutes'(2): ");
				String p2Line1 = scan.next();
				if(p2Line1.equals("1")) {
					System.out.println("??? - Who are you?");
					System.out.print("Do you say 'I'm Logan and you are...?'(1) or scream 'Who are you!?'(2): ");
					p1Line1 = scan.next();
					if(p1Line1.equals("1")) {
						System.out.println("You - I'm Logan and you are...?");
						System.out.println("??? - Uh- Christian");
						break;
					}
					else if(p1Line1.equals("2")) {
						System.out.println("You - Who are you?!");
						System.out.println("??? - Who are you!?");
						System.out.println("This goes on for several hours until you are both exhausted");
						break;
					}
					else {
						System.out.println("That is not a valid option");
						continue;
					}
				}
				else if(p2Line1.equals("2")) {
					System.out.println("??? - Just 5 more minutes");
					System.out.print("Do you say 'Excuse me?'(1) or scream 'Y O U   I M B E C I L E !' and slap him across the face(2): ");
					String p1Line2 = scan.next();
					if(p1Line2.equals("1")) {
						System.out.println("You - Excuse me?");
						System.out.println("??? - Uh...");
						break;
					}
					else if(p1Line2.equals("2")) {
						System.out.println("You - Y O U   I M B E C I L E !");
						System.out.println("You slap him across the face and it makes a satisfying noise");
						System.out.println("??? - Ow!");
						break;
					}
					else {
						System.out.println("That is not a valid option");
						continue;
					}
				}
				else {
					System.out.println("That is not a valid option");
					continue;
				}
			}
			System.out.println("");
			System.out.println("After that wonderful introduction, you two sit down to talk");
			if(!p1Line1.equals("1")) {
				System.out.println("You say your name is Logan and he says his name is Christian");
			}
			while(true) {
				System.out.print("Does Player 2 say 'Where are we?'(1) or 'How did you get here?'(2): ");
				String p2Line2 = scan.next();
				if(p2Line2.equals("1")) {
					System.out.println("Christian - Where are we?");
					System.out.println("You - I have no idea");
					break;
				}
				else if(p2Line2.equals("1")) {
					System.out.println("Christian - How did you get here?");
					System.out.println("You - I can't quite remember... Maybe I hit my head on something... I think I fell into this hole we're in");
					break;
				}
			}
			System.out.println("You both decide to stick together to find a way out of this mess");
			System.out.println("Christian decides to mine out of the cave but realizes his Pickaxes have broken");
			System.out.println("Two stalactites fall from the ceiling and Christian starts mkaing things with them");
			System.out.print("Does Player 2 decide to build a makeshift ladder(1) or two Ice Picks(2): ");
			String mineDirection = scan.next();
			while(true) {
				if(mineDirection.equals("1")) {
					System.out.println("Christian - I built a ladder to t");
					System.out.println("You - That's a good idea, I'll come with");
					break;
				}
				if(mineDirection.equals("2")) {
					System.out.println("Christian - We should dig forwards until we reach another cave or the edge of a mountain");
					System.out.println("You - I think we should dig upwards towards the surface");
					System.out.println("You - We should split up until one of us finds something");
					break;
				}
			}
		}
	}
}
