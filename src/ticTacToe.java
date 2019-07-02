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
		while(true) {
			System.out.println("Player turn");
			String playerMove[] = new String[2];
			do {
				System.out.print("Where will you place your X: ");
				playerMove = scan.nextLine().split(","); //[x,y]... [x=0,y=1]
			}while(playerMove.length!=2);
			int x = -1;
			int y = -1;
			try {
				x = Integer.parseInt(playerMove[0]);
				y =  Integer.parseInt(playerMove[1]);
			}catch(NumberFormatException e) {
				System.out.println("Please enter two coordinates, separated by a comma.");
				continue;
			}

			if(x>2 || x<0 || y>2 || y<0) {
				System.out.println("That coordinate does not exist");
				continue;
			}

			if(board[y][x].equals("-")) {
				board[y][x] = ("X");
			}else {
				System.out.println("Something is already placed here");
				continue;
			}
			printBoard(board);
			String win = checkWin(board);
			if(win != null) {
				System.out.println(win + " wins!");
				break;
			}
			System.out.println("Computer turn");
			while(true) {
				x = rand.nextInt(2)+1;
				y =  rand.nextInt(2)+1;
				if(board[y][x].equals("-")) {
					board[y][x] = ("O");
					break;
				}else {
					continue;
				}
			}
			printBoard(board);
			win = checkWin(board);
			if(win != null) {
				System.out.println(win + " wins!");
				break;
			}

		}
		scan.close();

	}

	private static void printBoard(String[][] board) {
		System.out.println();
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static String checkWin(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(!board[i][j].equals("-")) {
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
					if(i==0 && j == board[0].length-1) {
						if(board[i][j].equals(board[i+1][j-1]) && board[i][j].equals(board[i+2][j-2])) {
							return board[i][j];
						}
					}
				}

			}
		}
		return null;
	}
}