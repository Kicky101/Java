import java.util.Scanner;

import java.util.Random;

public class tictactoe2 {
	public static void main(String[] args) {
		boolean finalLoop = true;
		boolean turn = true;
		boolean quitLoop = true;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[][] board = new String[3][3];
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				board[j][i] = "-";
			}
		}
		printBoard(board);
		while(finalLoop) {
			int quitCheck = 2;
			while(turn) {
				System.out.println("Player turn");
				System.out.print("Where will you place your X (xcord): ");
				int x = scan.nextInt();
				System.out.print("Where will you place your X (ycord): ");
				int y = scan.nextInt();
				if(x>2 || x<0 || y>2 || y<0) {
					System.out.println("That coordinate does not exist");
					continue;
				}
				if(board[x][y].equals("-")) {
					board[x][y] = ("X");
					turn = false;
				}
				else {
					System.out.println("Something is already placed here");
					continue;
				}
			}
			turn = true;
			System.out.println();
			printBoard(board);
			String win = checkWin(board);
			if(win != null || checkTie(board)) {
				if(win != null) {
					System.out.println(win + " wins!");
				}
				if(checkTie(board)) {
					System.out.println("Tie!");
				}
				while(quitLoop) {
					System.out.print("Do you want to play again: ");
					String quit = scan.next();
					if(quit.toLowerCase().equals("no")) {
						quitLoop = false;
						quitCheck = 0;
					}
					else if(quit.toLowerCase().equals("yes")){
						quitLoop = false;
						quitCheck = 1;
					}
				}		
			}
			if(quitCheck == 0) {
				break;
			}
			else if(quitCheck == 1) {
				for(int i = 0; i<board.length; i++) {
					for(int j = 0; j<board[0].length; j++) {
						board[i][j] = "-";
					}
				}
				continue;
			}
			System.out.println("Computer turn");
			while(turn) {
				int x = rand.nextInt(3);
				int y = rand.nextInt(3);
				if(board[x][y].equals("-")) {
					board[x][y] = ("O");
					turn = false;
				}
				else {
					continue;
				}
			}
			turn = true;
			printBoard(board);
			win = checkWin(board);
			if(win != null || checkTie(board)) {
				if(win != null) {
					System.out.println(win + " wins!");
				}
				if(checkTie(board)) {
					System.out.println("Tie!");
				}
				while(quitLoop) {
					System.out.print("Do you want to play again: ");
					String quit = scan.next();
					if(quit.toLowerCase().equals("no")) {
						quitLoop = false;
						quitCheck = 0;
					}
					else if(quit.toLowerCase().equals("yes")){
						quitLoop = false;
						quitCheck = 1;
					}
				}		
			}
			if(quitCheck == 0) {
				break;
			}
			else if(quitCheck == 1) {
				for(int i = 0; i<board.length; i++) {
					for(int j = 0; j<board[0].length; j++) {
						board[i][j] = "-";
					}
				}
				continue;
			}
		}
		scan.close();
	}
	
	private static void printBoard(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static boolean checkTie(String[][] board) {
		boolean tie = true;
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(board[i][j].equals("-")) {
					tie = false;
				}
			}
		}
		return tie;
	}
	
	private static String checkWin(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(!board[i][j].equals("-")) {
					if(j==0) {
						if(board[i][j].equals(board[i][j+1]) && board[i][j].equals(board[i][j+2])) {
							System.out.println("h");
							return board[i][j];
						}
					}
					if(i==0) {
						if(board[i][j].equals(board[i+1][j]) && board[i][j].equals(board[i+2][j])) {
							System.out.println("v");
							return board[i][j];
						}
					}
					if(i==0 && j == 0) {
						if(board[i][j].equals(board[i+1][j+1]) && board[i][j].equals(board[i+2][j+2])) {
							System.out.println("d1");
							return board[i][j];
						}
					}
					if(i==0 && j == board[0].length-1) {
						if(board[i][j].equals(board[i+1][j-1]) && board[i][j].equals(board[i+2][j-2])) {
							System.out.println("d2");
							return board[i][j];
						}
					}
				}

			}
		}
		return null;
	}
}
