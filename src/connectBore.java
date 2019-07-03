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
			int redTurn = -1;
			int yellowTurn = -1;
			while(true) {
				System.out.println("Red turn");
				System.out.print("Where will you place your marker: ");
				redTurn = scan.nextInt();
				if(redTurn>board.length-1 || redTurn<0) {
					System.out.println("That coordinate does not exist");
					continue;
				}break;
			}
			board = placePiece(board,true,redTurn);
			printBoard(board);
			if(checkWin(board)!=null) {
				System.out.println(checkWin(board)+" wins!");
				break;
			}
			while(true) {
				System.out.println("Yellow turn");
				System.out.print("Where will you place your marker: ");
				yellowTurn = scan.nextInt();
				if(yellowTurn>board.length || yellowTurn<0) {
					System.out.println("That coordinate does not exist");
					continue;
				}break;
			}
			board = placePiece(board,false,yellowTurn);
			printBoard(board);
			if(checkWin(board)!=null) {
				System.out.println("Yellow wins!");
				break;
			}
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
	private static String checkWin(String[][] board) {
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(board[i][j].equals("-")) {
					continue;
				}
				if(i < board.length-3) {
					if(board[i][j].equals(board[i+1][j]) && board[i][j].equals(board[i+2][j]) && board[i][j].equals(board[i+3][j])) {
						return board[i][j];
					}
				}
				else if(j < board[0].length-3) {
					if(board[i][j].equals(board[i][j+1]) && board[i][j].equals(board[i][j+2]) && board[i][j].equals(board[i][j+3])) {
						return board[i][j];
					}
				}
				else if(i < board.length-3 && j < board[0].length-3) {
					if(board[i][j].equals(board[i+1][j+1]) && board[i][j].equals(board[i+2][j+2]) && board[i][j].equals(board[i+3][j+3])) {
						return board[i][j];
					}
				}else if(i < board.length-3 && j >=3 ) {
					if(board[i][j].equals(board[i+1][j-1]) && board[i][j].equals(board[i+2][j-2]) && board[i][j].equals(board[i+3][j-3])) {
						return board[i][j];
					}
				}
			}
		}
		return null;
	}
}
