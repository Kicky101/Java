//A grid where a player can move in the four cardinal directions to reach a goal
//Has screen wrapping functions, and keeps track of the lowest amount of moves it takes to reach the goal
//Asks the user to play again at the end, and if yes, generates a new goal position while keeping the player position

import java.util.Scanner;
import java.util.Random;

public class room2 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//define room
		String[][] board = new String[25][25];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "-";
			}
		}
		//place player and goal in random place, making sure they dont overlap
		int x = rand.nextInt(board.length);
		int y = rand.nextInt(board.length);
		board[x][y] = "U"; //goal symbol
		while(board[x][y].equals("U")) {
			x = rand.nextInt(board.length);
			y = rand.nextInt(board.length);
		}
		board[x][y] = "@"; //player symbol
		String quit = ""; //question at the end to make the game repeat
		String move; //question for player move
		boolean win; //checks if the player won
		boolean loop; //loop for the very end to make sure the user inputs a correct option
		int best = -1; //keeps track of the lowest number of moves the player makes each game
		//is -1 for the first game, because no best has been set yet
		int moves = 1; //keeps track of the amount of moves in the current game
		while(!quit.equals("n")) {
			win = false;
			System.out.println("Move #"+moves+"\n");
			//print board
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board.length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			//user input
			System.out.print("\nWhich way will you go? (up, down, left, right): ");
			move = scan.nextLine();
			//trim and toLowerCase allow for user flexibility
			move = move.trim().toLowerCase();
			//simple version of clearing screen
			for(int i = 0; i < 100; i++) {
				System.out.println();
			}
			//all options have allowance for screen wrapping
			//ex: move to the end of one side and end up on the opposite side
			//all options also check for win
			if(move.equals("up")) {
				if(x==0) {
					if(board[board.length-1][y].equals("U")) {
						win = true;
					}
					board[board.length-1][y] = "@";
					board[x][y] = "-";
					x=board.length-1;
				}
				else {
					if(board[x-1][y].equals("U")) {
						win = true;
					}
					board[x-1][y] = "@";
					board[x][y] = "-";
					x=x-1;
				}
			}
			else if(move.equals("down")) {
				if(x==board.length-1) {
					if(board[0][y].equals("U")) {
						win = true;
					}
					board[0][y] = "@";
					board[x][y] = "-";
					x=0;
				}
				else {
					if(board[x+1][y].equals("U")) {
						win = true;
					}
					board[x+1][y] = "@";
					board[x][y] = "-";
					x=x+1;
				}
			}
			else if(move.equals("left")) {
				if(y==0) {
					if(board[x][board.length-1].equals("U")) {
						win = true;
					}
					board[x][board.length-1] = "@";
					board[x][y] = "-";
					y=board.length-1;
				}
				else {
					if(board[x][y-1].equals("U")) {
						win = true;
					}
					board[x][y-1] = "@";
					board[x][y] = "-";
					y=y-1;
				}
			}
			else if(move.equals("right")) {
				if(y==board.length-1) {
					if(board[x][0].equals("U")) {
						win = true;
					}
					board[x][0] = "@";
					board[x][y] = "-";
					y=0;
				}
				else {
					if(board[x][y+1].equals("U")) {
						win = true;
					}
					board[x][y+1] = "@";
					board[x][y] = "-";
					y=y+1;
				}
			}
			else {
				System.out.println("That is not a valid input\n");
				continue;
			}
			//if the player won
			if(win) {
				for(int i = 0; i < board.length; i++) {
					for(int j = 0; j < board.length; j++) {
						System.out.print(board[i][j] + " ");
					}
					System.out.println();
				}
				System.out.print("\nYou won! It took you " + moves + " moves to win. ");
				//-1 is for the first game
				if(best == -1 || moves < best) {
					System.out.print("A new record! ");
					//wont work on the first game
					if(moves < best) {
						System.out.print("Your best was previously " + best + ". ");
					}
					best = moves;
				}
				//loop to make sure something valid is inputted
				loop = true;
				while(loop) {
					System.out.print("Would you like to play again? (y/n): ");
					quit = scan.nextLine();
					quit = quit.trim().toLowerCase();
					if(quit.equals("y")) {
						//replace the goal, dont replace the player
						while(board[x][y].equals("@")) {
							x = rand.nextInt(board.length);
							y = rand.nextInt(board.length);
						}
						board[x][y] = "U";
						//find the player again to reset the x and y coords to match up to that of the player
						for(int i = 0; i < board.length; i++) {
							for(int j = 0; j < board.length; j++) {
								if(board[i][j].equals("@")) {
									x = i;
									y = j;
								}
							}
						}
						loop = false;
						//reset the moves
						moves = 0;
						for(int i = 0; i < 100; i++) {
							System.out.println();
						}
					}
					else if(quit.equals("n")) {
						System.out.print("\nThanks for playing!");
						loop = false;
					}
					else {
						for(int i = 0; i < 100; i++) {
							System.out.println();
						}
						System.out.println("\nThat is not a valid input\n");
						for(int i = 0; i < board.length; i++) {
							for(int j = 0; j < board.length; j++) {
								System.out.print(board[i][j] + " ");
							}
							System.out.println();
						}
						System.out.println();
					}
				}
			}
			//increases the amount of moves after every turn
			moves++;
		}
		scan.close();
	}
}
