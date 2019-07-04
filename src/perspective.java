import java.util.Scanner;

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
		if(startGame) {
			System.out.println("You wake up in your bed like any other day, bored as hell");
			System.out.println("You walk over to your closet to find something to do");
			System.out.println("In it you find an old Gamechild, the screen is cracked");
			System.out.println("You boot it up and it opens to Tic Tac Toe");
			System.out.print("Do you play the game or not: ");
			String playTicTacToe = scan.next();
			if(playTicTacToe.toLowerCase().equals("yes")) {
				badTicTacToe.main(new String[0]);
				System.out.println("The game appears to have crashed");
			}
			else if(playTicTacToe.toLowerCase().equals("no")) {
				System.out.println("You put the console down and walk away");
			}
			else {
				System.out.println("You fail to decide and end up putting the game down");
			}
		}
	}
}
