import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class perspective {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		typeln("O V E R R A T E D   R P G   G A M E");
		boolean titleLoop = true;
		boolean startGame = false;
		while(titleLoop) {
			type("Type START to start the game, OPTIONS to open the options menu, or EXIT to exit the game: ");
			String titleCommand = scan.next();
			if(titleCommand.toLowerCase().equals("options")) {
				while(true) {
					System.out.println();
					typeln("Back to Menu Mode - OFF");
					for(int i = 0; i<6; i++) {
						typeln("Null - OFF");
					}
					System.out.println();
					typeln("");
					type("Do you want to turn Back to Menu Mode on: ");
					String backToTitle = scan.next();
					if(backToTitle.toLowerCase().equals("no")) {
						continue;
					}
					else if(backToTitle.toLowerCase().equals("yes")) {
						System.out.println();
						break;
					}
					else {
						typeln("Interpreting vague answer as 'no'");
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
				typeln("Excuse me?");
			}
		}
		int recklessness = 0;
		int nature = 0;
		if(startGame) {
			typeln("PROLOUGE");
			typeln("You wake up in your bed like any other day, bored as hell");
			typeln("You walk over to your closet to find something to do");
			typeln("In it you find an old Gamechild, the screen is cracked");
			typeln("You boot it up and it opens to Tic Tac Toe");
			type("Do you play the game or not: ");
			String playTicTacToe = scan.next();
			if(playTicTacToe.toLowerCase().equals("yes")) {
				badTicTacToe.main(new String[0]);
				typeln("The game appears to have crashed");
				typeln("You put down the broken console and walk away");
			}
			else if(playTicTacToe.toLowerCase().equals("no")) {
				typeln("You put the console down and walk away");
			}
			else {
				typeln("You fail to decide and end up putting the console down");
			}
			typeln("You decide that that's enough games for today and go to the kitchen for some cereal");
			typeln("When you open up the cabinet you see two delicious cereals");
			type("Do you eat Ronald's Puffs or Beerios: ");
			String cereal = "";
			if (scan.hasNext()) {
				if (scan.hasNextLine()) {
					cereal = scan.nextLine();
				}
			}
			if(cereal.toLowerCase().equals("beerios")) {
				typeln("You make the reckless decision of consuming alcohol coated cereal in the morning");
				System.out.println();
				typeln("+1 recklessnes!");
				recklessness = recklessness + 1;
				System.out.println();
				typeln("You pour your Beerios into the bowl and go to the fridge to get milk");
			}
			else if(cereal.toLowerCase().equals("ronald's puffs")) {
				typeln("You make the well balanced decision of eating a tasty cereal in the morning");
				typeln("You pour your Ronald's Puffs into the bowl and go to the fridge to get milk");
			}
			else {
				typeln("You fail to decide and move your hand towards a random ceareal box");
				typeln("You grab Ronald's Puffs");
				typeln("You pour your Ronald's Puffs into the bowl and go to the fridge to get milk");
			}
			typeln("But, a deep feeling of dread surrounds you");
			typeln("...");
			typeln("You're out of milk");
			typeln("...");
			typeln("So you decide to go to the store to get more");
			System.out.println();
			typeln("On your way to the store you pass a woman walking a dog");
			type("Do you pet the dog or not: ");
			String petDog = "";
			if (scan.hasNext()) {
				scan.nextLine();
				if (scan.hasNextLine()) {
					petDog = scan.nextLine();
				}
			}
			if(petDog.toLowerCase().equals("no")) {
				typeln("You keep walking");
			}
			else if(petDog.toLowerCase().equals("yes")) {
				typeln("You stop and pet the dog");
				System.out.println();
				typeln("+2 nature!");
				nature = nature + 2;
				System.out.println();
			}
			else {
				typeln("You fail to decide and end up walking away");
			}
			typeln("When you're about 50 meters away from the grocery store, you here a rumbling and the ground beneath you begins to shake");
			typeln("You drop to the floor, thinking its an earthquake");
			typeln("But the ground beneath you falls");
			typeln("It was a sinkhole!");
			typeln("And its a long way down");
			typeln("You land in an ice pond and blackout");
			typeln("PROLOUGE COMPLETE");
			try{
				type("Press Enter to continue...");
				System.in.read();
			}
			catch(Exception e){	
				e.printStackTrace();
			}
			for(int i=0; i<10; i++) {
				System.out.println();
			}
			typeln("CHAPTER ONE");
			typeln("You slowly open your eyes to see random chunks of ice scattered about in a hole you're in");
			typeln("You're in a puddle, knee deep");
			typeln("You see another person passed out");
			typeln("In a panic you run over to him and shake him awake");
			typeln("His eyes slowly open");
			String p1Line1 = "";
			while(true) {
				type("Does Player 2 say 'Who are you?'(1) or 'Just 5 more minutes'(2): ");
				String p2Line1 = scan.next();
				if(p2Line1.equals("1")) {
					typeln("??? - Who are you?");
					type("Do you say 'I'm Logan and you are...?'(1) or scream 'Who are you!?'(2): ");
					p1Line1 = scan.next();
					if(p1Line1.equals("1")) {
						typeln("You - I'm Logan and you are...?");
						typeln("??? - Uh- Christian");
						break;
					}
					else if(p1Line1.equals("2")) {
						typeln("You - Who are you?!");
						typeln("??? - Who are you!?");
						typeln("This goes on for several hours until you are both exhausted");
						break;
					}
					else {
						typeln("That is not a valid option");
						continue;
					}
				}
				else if(p2Line1.equals("2")) {
					typeln("??? - Just 5 more minutes");
					type("Do you say 'Excuse me?'(1) or scream 'Y O U   I M B E C I L E !' and slap him across the face(2): ");
					String p1Line2 = scan.next();
					if(p1Line2.equals("1")) {
						typeln("You - Excuse me?");
						typeln("??? - Uh...");
						break;
					}
					else if(p1Line2.equals("2")) {
						typeln("You - Y O U   I M B E C I L E !");
						typeln("You slap him across the face and it makes a satisfying noise");
						typeln("??? - Ow!");
						break;
					}
					else {
						typeln("That is not a valid option");
						continue;
					}
				}
				else {
					typeln("That is not a valid option");
					continue;
				}
			}
			typeln("");
			typeln("After that wonderful introduction, you two sit down to talk");
			if(!p1Line1.equals("1")) {
				typeln("You say your name is Logan and he says his name is Christian");
			}
			while(true) {
				type("Does Player 2 say 'Where are we?'(1) or 'How did you get here?'(2): ");
				String p2Line2 = scan.next();
				if(p2Line2.equals("1")) {
					typeln("Christian - Where are we?");
					typeln("You - I have no idea");
					break;
				}
				else if(p2Line2.equals("1")) {
					typeln("Christian - How did you get here?");
					typeln("You - I can't quite remember... Maybe I hit my head on something... I think I fell into this hole we're in");
					break;
				}
			}
			typeln("You both decide to stick together to find a way out of this mess");
			typeln("Christian decides to mine out of the cave but realizes his Pickaxes have broken");
			typeln("Two stalactites fall from the ceiling and Christian starts mkaing things with them");
			type("Does Player 2 decide to build a makeshift ladder(1) or two Ice Picks(2): ");
			String mineDirection = scan.next();
			while(true) {
				if(mineDirection.equals("1")) {
					typeln("Christian - I built a ladder to t");
					typeln("You - That's a good idea, I'll come with");
					break;
				}
				if(mineDirection.equals("2")) {
					typeln("Christian - We should dig forwards until we reach another cave or the edge of a mountain");
					typeln("You - I think we should dig upwards towards the surface");
					typeln("You - We should split up until one of us finds something");
					break;
				}
			}
		}
	}
	private static void type(String hi) {
		for(int i = 0; i<hi.length(); i++) {
			System.out.print(hi.charAt(i));
			if(hi.charAt(i)==' '){
			try{
				Thread.sleep(120);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(60);
					}
					catch(InterruptedException e){
					}
			}
		}
	}
	private static void typeln(String hi) {
		for(int i = 0; i<hi.length(); i++) {
			System.out.print(hi.charAt(i));
			if(hi.charAt(i)==' '){
			try{
				Thread.sleep(120);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(60);
					}
					catch(InterruptedException e){
					}
			}
		}
		System.out.println();
	}
}
