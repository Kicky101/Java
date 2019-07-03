import java.util.Scanner;

public class connectBore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] board = new String[8][8]; //[y][x]
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				board[i][j] = "-";
			}
		}
		printBoard(board);
		while(true) {
			System.out.println("Red turn");
			System.out.print("Where will you place your marker: ");
			int redTurn = scan.nextInt();
			board = placePiece(board,true,redTurn);
			printBoard(board);
			System.out.println("Yellow turn");
			System.out.print("Where will you place your marker: ");
			int yellowTurn = scan.nextInt();
			board = placePiece(board,false,yellowTurn);
			printBoard(board);
		}
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
	private static String[][] placePiece(String[][] board, boolean turn, int place) {
		if(!board[0][place].equals("-")) {
			System.out.println("That input is invalid");
			return board;
		}
		for(int i = 0; i<board.length; i++) {
			if(i == board.length-1 && board[i][place].equals("-")) {
				board[i][place] = (turn ? "R" : "Y");
			}else if(board[i][place].equals("-") && !board[i+1][place].equals("-")) {
				board[i][place] = (turn ? "R" : "Y");
			}
		}
		return board;
	}
}
