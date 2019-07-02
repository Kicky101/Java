import java.util.Scanner;

import java.util.Random;

public class ticTacToe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String[][] board = new String[3][3]; //[y][x]
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				board[i][j] = "-";
			}
		}
		printBoard(board);
		boolean loop = true;
		while(loop) {
			System.out.println("Player turn");
			System.out.print("Where will you place your X: ");
			String[] playerMove = scan.next().split(","); //[x,y]... [x=0,y=1]
			int x = Integer.parseInt(playerMove[0]);
			int y =  Integer.parseInt(playerMove[1]);
			if(board[y][x].equals("-")) {
				board[y][x] = ("X");
			}else {
				System.out.println("Something is already placed here");
				continue;
			}
			printBoard(board);
			checkWin(board);

		}

	}

	private static void printBoard(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static String checkWin(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(j==0) {
					if(board[i][j].equals(board[i][j+1]) && board[i][j].equals(board[i][j+2])) {
						return board[i][j];
					}
				}
				if(i==0) {
					if(board[i][j].equals(board[i+1][j]) && board[i][j].equals(board[i+2][j])) {
						return board[i][j];
					}
				}
				if(i==0 && j == 0) {
					if(board[i][j].equals(board[i+1][j+1]) && board[i][j].equals(board[i+2][j+2])) {
						return board[i][j];
					}
				}
				if(i==0 && j == board[0].length) {
					if(board[i][j].equals(board[i+1][j-1]) && board[i][j].equals(board[i+2][j-2])) {
						return board[i][j];
					}
				}
			}
		}
		return null;
	}
}