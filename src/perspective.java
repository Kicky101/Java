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
			String cereal = scan.next();
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
			String petDog = scan.next();
			if(petDog.toLowerCase().equals("no")) {
				System.out.println("You keep walking");
			}
			if(petDog.toLowerCase().equals("yes")) {
				System.out.println("You stop and pet the dog");
				System.out.println();
				System.out.println("+2 nature!");
				nature = nature + 2;
				System.out.println();
			}
			System.out.println("When you're about 50 meters away from the grocery store, you here a rumbling and the ground beneath you begins to shake");
			System.out.println("You drop to the floor, thinking its an earthquake");
			System.out.println("But the ground beneath you falls");
			System.out.println("It was a sinkhole!");
			System.out.println("And its a long way down");
			System.out.println("You land in an ice pond and blackout");
			System.out.println("PROLOUGE COMPLETE");
			for(int i=0; i<10; i++) {
				System.out.println();
			}
			System.out.println("CHAPTER ONE");
			System.out.println("You slowly open your eyes to see random chunks of ice scattered about in a hole you're in");
			System.out.println("You're in a puddle, knee deep");
			System.out.println("You see another person passed out");
			System.out.println("Lmao pee pee doo doo");
		}
	}
}
