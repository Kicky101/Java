import java.util.Scanner;

import java.util.Random;

public class rockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			System.out.print("Enter rock, paper, scissors, or quit: ");
			String playerMove = scan.next();
			int comMove = rand.nextInt((3-1)+1)+1;
			int playerMoveNum = 0;
			if(playerMove.toLowerCase().equals("rock")) { 
				playerMoveNum = 1;
			}
			else if(playerMove.toLowerCase().equals("paper")) { 
				playerMoveNum = 2;
			}
			else if(playerMove.toLowerCase().equals("scissors")) { 
				playerMoveNum = 3;
			}
			else if(playerMove.toLowerCase().equals("quit")) { 
				break;
			}
			else {
				System.out.println("That is not a valid input");
				continue;
			}
			if(playerMoveNum == comMove) {
				System.out.println("Draw");
			}
			else if(playerMoveNum == 3 && comMove == 1) {
				System.out.println("Lose");
			}
			else if(playerMoveNum == 1 && comMove == 3) {
				System.out.println("Win");
			}
			else if(playerMoveNum > comMove) {
				System.out.println("Win");
			}
			else if(playerMoveNum < comMove) {
				System.out.println("Lose");
			}
			
		}
		scan.close();
		
	}
}
