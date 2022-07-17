import java.util.Scanner;
import java.util.Random;

public class battleship {
	//4: 1 ships
	//3: 2 ships
	//2: 3 ships
	//1: 4 ship
	static String[][] p1Board;
	static String[][] p2Board;
	static String[][] comBoard;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		p1Board = new String[10][10];
		p2Board = new String[10][10];
		comBoard = new String[10][10];
		defineBoard(p1Board);
		defineBoard(p2Board);
		defineBoard(comBoard);
		boolean trueLoop = true;
		boolean loop = true;
		while(trueLoop) {
			System.out.print("Do you want to start (s) or quit (q): ");
			String start1 = scan.nextLine();
			if(start1.equals("s")) {
				while(loop) {
					System.out.println();
					System.out.print("Do you want to play against a computer (c) or a player (p): ");
					String start2 = scan.nextLine();
					if(start2.equals("c")) {
						clear();
						System.out.println();
						System.out.println("Player ship placing phase\n");
						placeShips(p1Board, scan);
						System.out.println("Computer placing ships...\n");
					}
					else if(start2.equals("p")) {
						System.out.println();
					}
					else {
						System.out.println();
						System.out.println("That is not a valid input");
					}
				}
			}
			else if(start1.equals("q")) {
				trueLoop = false;
			}
			else {
				System.out.println();
				System.out.println("That is not a valid input");
				System.out.println();
			}
		}
		scan.close();
	}
	public static void printBoard(String[][] board) {
		String temp = "  ";
		for(int i = 0; i < board.length; i++) {
			temp = temp + i + " ";
		}
		System.out.println(temp);
		for(int i = 0; i < board.length; i++) {
			System.out.print("" + i + " ");
			for(int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void placeShips(String[][] board, Scanner scan) {
		boolean fThree = false;
		int[] threeCoordsX = {-1,-1,-1};
		int[] threeCoordsY = {-1,-1,-1};
		int shipType = 2;
		boolean threeShip = true;
		int x = 0;
		int y = 0;
		int counter = 0;
		boolean horiz = true;
		boolean loop = true;
		boolean loop2 = true;
		for(int i = 0; i < 5; i++) {
			loop = true;
			while(loop) { 
				loop2 = true;
				printBoard(board);
				System.out.print("\nwhere do you want to place your " + shipType + " ship, and in what orientation (h/v)? (separate by comma. ex: x, y, v): ");
				String playerMove = scan.nextLine();
				counter = 0;
				for(int j = 0; j < playerMove.length(); j++) {
					if(playerMove.substring(j,j+1).equals(",")) {
						counter++;
					}
				}
				if(counter!=2 || playerMove.substring(playerMove.length()-1).equals(",")) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					counter = 0;
					continue;
				}
				String tempString = "";
				Scanner scann = new Scanner(playerMove);
				scann.useDelimiter(",");
				tempString = scann.next();
				tempString = tempString.trim();
				if(!tempString.matches(".*\\d.*")) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				if(Integer.parseInt(tempString) > 9 || Integer.parseInt(tempString) < 0) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				x = Integer.parseInt(tempString);
				tempString = scann.next();
				tempString = tempString.trim();
				if(!tempString.matches(".*\\d.*")) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				if(Integer.parseInt(tempString) > 9 || Integer.parseInt(tempString) < 0) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				y = Integer.parseInt(tempString);
				tempString = scann.next();
				tempString = tempString.trim();
				if(tempString.equals("h")) {
					horiz = true;
				}
				else if(tempString.equals("v")) {
					horiz = false;
				}
				else {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				scann.close();
				clear();
				for(int j = 0; j < shipType; j++) {
					if(horiz) {
						if(y+j > 9 || !(board[x][y+j].equals("-"))) {
							clear();
							System.out.println("\nThat is not a valid input\n");
							for(int k = 0; k < shipType; k++) {
								if(shipType == 3) {
									for(int l = 0; l < 3; l++) {
										if(x == threeCoordsX[l] && y+k == threeCoordsY[l]) {
											fThree = true;
										}
									}
								}
								if(y+k > 9 || !(board[x][y+k].equals("-")) && !(board[x][y+k].equals("" + shipType)) ) {
									break;
								}
								if(fThree) {
									fThree = false;
									break;
								}
								board[x][y+k] = "-";
							}
							loop2 = false;
							break;
						}
						board[x][y+j] = "" + shipType;
					}
					else {
						if(x+j > 9 || !(board[x+j][y].equals("-"))) {
							clear();
							System.out.println("\nThat is not a valid input\n");
							for(int k = 0; k < shipType; k++) {
								if(shipType == 3) {
									for(int l = 0; l < 3; l++) {
										if(x+k == threeCoordsX[l] && y == threeCoordsY[l]) {
											fThree = true;
										}
									}
								}
								if(x+k > 9 || !(board[x+k][y].equals("-")) && !(board[x+k][y].equals("" + shipType))) {
									break;
								}
								if(fThree) {
									fThree = false;
									break;
								}
								board[x+k][y] = "-";
							}
							loop2 = false;
							break;
						}
						board[x+j][y] = "" + shipType;
					}
				}
				while(loop2) {
					printBoard(board);
					System.out.print("\nIs this ok? (y/n): ");
					String finalDecision = scan.nextLine();
					if(finalDecision.equals("y")) {
						if(shipType == 3) {
							if(horiz) {
								for(int j = 0; j < shipType; j++) {
									threeCoordsX[j] = x;
									threeCoordsY[j] = y+j;
								}
							}
							else {
								for(int j = 0; j < shipType; j++) {
									threeCoordsX[j] = x+j;
									threeCoordsY[j] = y;
								}
							}
						}
						clear();
						loop = false;
						loop2 = false;
						if(threeShip && shipType == 3) {
							threeShip = false;
						}
						else {
							shipType++;
						}
					}
					else if(finalDecision.equals("n")) {
						for(int j = 0; j < shipType; j++) {
							if(horiz) {
								board[x][y+j] = "-";
							}
							else {
								board[x+j][y] = "-";
							}
						}
						clear();
						loop2 = false;
					}
					else {
						clear();
						System.out.println("\nThat is not a valid input\n");
						continue;
					}
				}
			}	
		}
		//scan.close();
	}
	public static void defineBoard(String[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "-";
			}
		}
	}
	public static void clear() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}