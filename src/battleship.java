import java.util.Scanner;
import java.util.Random;

public class battleship {
	static String[][] p1Board;
	static String[][] p2Board;
	static String[][] comBoard;
	static String[][] p1ViewBoard;
	static String[][] p2ViewBoard;
	static String[][] p1BoardSave;
	static String[][] p2BoardSave;
	static String[][] comBoardSave;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		p1Board = new String[10][10];
		p2Board = new String[10][10];
		comBoard = new String[10][10];
		p1ViewBoard = new String[10][10];
		p2ViewBoard = new String[10][10];
		p1BoardSave = new String[10][10];
		p2BoardSave = new String[10][10];
		comBoardSave = new String[10][10];
		boolean trueLoop = true;
		boolean loop = true;
		while(trueLoop) {
			loop = true;
			defineBoard(p1Board);
			defineBoard(p2Board);
			defineBoard(comBoard);
			defineBoard(p1ViewBoard);
			defineBoard(p2ViewBoard);
			System.out.print("Do you want to start (s) or quit (q): ");
			String start1 = scan.nextLine();
			if(start1.equals("s")) {
				while(loop) {
					System.out.println();
					System.out.print("Do you want to play against a computer (c) or a player (p): ");
					String start2 = scan.nextLine();
					if(start2.equals("c")) {
						loop = false;
						clear();
						System.out.println("Player ship placing phase\n");
						placeShips(p1Board, scan);
						copyBoard(p1Board, p1BoardSave);
						clear();
						System.out.println("Your ships have been placed!\n");
						printBoard(p1Board);
						System.out.print("\nPress Enter to Continue: ");
						scan.nextLine();
						clear();
						fakeLoad("Computer placing ships");
						placeComShips(comBoard, rand);
						copyBoard(comBoard, comBoardSave);
						System.out.println("Computer Ships Placed!\n");
						printBoard(comBoard);
						System.out.print("\nPress Enter to Continue: ");
						scan.nextLine();
						while(true) {
							clear();
							playerTurn(p1ViewBoard, comBoardSave, comBoard, scan);
						}
					}
					else if(start2.equals("p")) {
						loop = false;
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
			System.out.print("" + (char)(i+65) + " ");
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
				System.out.print("\nwhere do you want to place your " + shipType + " ship, and in what orientation (h/v)? (separate by comma. ex: A, 3, v): ");
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
				if(tempString.length() != 1) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				if(!(tempString.matches("^[a-zA-Z]*$"))) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				tempString = tempString.toUpperCase();
				if(((int)(tempString.charAt(0)))-65 > 9 || ((int)(tempString.charAt(0)))-65 < 0) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				x = ((int)(tempString.charAt(0)))-65;
				tempString = scann.next();
				tempString = tempString.trim();
				if(tempString.length() != 1) {
					clear();
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				if(!(tempString.matches(".*\\d.*"))) {
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
	}
	public static void placeComShips(String[][] board, Random rand) {
		boolean fThree = false;
		int[] threeCoordsX = {-1,-1,-1};
		int[] threeCoordsY = {-1,-1,-1};
		int shipType = 2;
		boolean threeShip = true;
		int x = 0;
		int y = 0;
		boolean horiz = true;
		int horizConv = 0;
		boolean loop = true;
		boolean check = true;
		for(int i = 0; i < 5; i++) {
			loop = true;
			while(loop) { 
				check = true;
				x = rand.nextInt(10);
				y = rand.nextInt(10);
				horizConv = rand.nextInt(2);
				if(horizConv == 0) {
					horiz = true;
				}
				else {
					horiz = false;
				}
				for(int j = 0; j < shipType; j++) {
					if(horiz) {
						if(y+j > 9 || !(board[x][y+j].equals("-"))) {
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
							check = false;
							break;
						}
						board[x][y+j] = "" + shipType;
					}
					else {
						if(x+j > 9 || !(board[x+j][y].equals("-"))) {
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
							check = false;
							break;
						}
						board[x+j][y] = "" + shipType;
					}
				}
				if(check) {
					loop = false;
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
					if(threeShip && shipType == 3) {
						threeShip = false;
					}
					else {
						shipType++;
					}
				}
			}
		}
	}
	public static void playerTurn(String[][] viewBoard, String[][] saveBoard, String[][] actBoard, Scanner scan) {
		boolean loop = true;
		boolean loop2 = true;
		int counter = 0;
		int x = 0;
		int y = 0;
		int destroy = 0;
		String result = "";
		while(loop) {
			loop2 = true;
			printBoard(viewBoard);
			System.out.print("\nwhere do you want to fire? (separate by comma. ex: A, 3): ");
			String playerMove = scan.nextLine();
			counter = 0;
			for(int j = 0; j < playerMove.length(); j++) {
				if(playerMove.substring(j,j+1).equals(",")) {
					counter++;
				}
			}
			if(counter!=1 || playerMove.substring(playerMove.length()-1).equals(",")) {
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
			if(tempString.length() != 1) {
				clear();
				System.out.println("\nThat is not a valid input\n");
				continue;
			}
			if(!(tempString.matches("^[a-zA-Z]*$"))) {
				clear();
				System.out.println("\nThat is not a valid input\n");
				continue;
			}
			tempString = tempString.toUpperCase();
			if(((int)(tempString.charAt(0)))-65 > 9 || ((int)(tempString.charAt(0)))-65 < 0) {
				clear();
				System.out.println("\nThat is not a valid input\n");
				continue;
			}
			x = ((int)(tempString.charAt(0)))-65;
			tempString = scann.next();
			tempString = tempString.trim();
			if(tempString.length() != 1) {
				clear();
				System.out.println("\nThat is not a valid input\n");
				continue;
			}
			if(!(tempString.matches(".*\\d.*"))) {
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
			if(!(viewBoard[x][y].equals("-"))) {
				clear();
				System.out.println("\nThat is not a valid input\n");
				continue;
			}
			scann.close();
			clear();
			viewBoard[x][y] = "@";
			while(loop2) {
				printBoard(viewBoard);
				System.out.print("\nIs this ok? (y/n): ");
				String finalDecision = scan.nextLine();
				if(finalDecision.equals("y")) {
					loop2 = false;
					loop = false;
				}
				else if(finalDecision.equals("n")) {
					loop2 = false;
					clear();
					viewBoard[x][y] = "-";
				}
				else {
					clear();
					System.out.println("That is not a valid input\n");
				}
			}
		}
		clear();
		fakeLoad("Firing");
		if(!(saveBoard[x][y].equals("-"))) {
			viewBoard[x][y] = "x";
			result = "A hit!";
		}
		else {
			viewBoard[x][y] = "*";
			result = "A miss!";
		}
		destroy = checkDestroy(viewBoard, saveBoard);
		printBoard(viewBoard);
		System.out.println("\n" + result);
		if(destroy > 1) {
			System.out.println("\nYou sunk the opponents " + destroy + " ship!");
		}
		System.out.print("\nPress Enter to Continue: ");
		scan.nextLine();
	}
	public static int checkDestroy(String[][] viewBoard, String[][] saveBoard) {
		boolean loop = true;
		int counter = 0;
		int kCount = 0;
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				if(viewBoard[x][y].equals("x")) {
					loop = true;
					kCount = 0;
					counter = 0;
					while(loop) {
						kCount++;
						if(kCount > 5) {
							loop = false;
						}
						if(!(x + counter > 9)) {
							if(saveBoard[x][y].equals(saveBoard[x+counter][y]) && viewBoard[x][y].equals(viewBoard[x+counter][y])) {
								counter++;
								if(counter == Integer.parseInt(saveBoard[x][y])) {
									for(int i = 0; i < counter; i++) {
										viewBoard[x+i][y] = saveBoard[x][y];
									}
									for(int i = 0; i < counter; i++) {
										saveBoard[x+i][y] = "-";
									}
									return counter;
								}
							}
						}
						if(!(y + counter > 9)) {
							if(saveBoard[x][y].equals(saveBoard[x][y+counter]) && viewBoard[x][y].equals(viewBoard[x][y+counter])) {
								counter++;
								if(counter == Integer.parseInt(saveBoard[x][y])) {
									if(counter == 3) {
										if(y-1 >= 0) {
											if(saveBoard[x][y-1].equals("3")) {
												if(y+3 <= 9) {
													if(saveBoard[x][y+3].equals("3")) {
														break;
													}
												}
											}
											if(saveBoard[x][y-1].equals("-")) {
												if(x-1 >= 0) {
													// need case for 
													// 333
													//   333
													if(saveBoard[x-1][y].equals("3")) {
														break;
													}
												}
												if(x+1 <= 9) {
													if(saveBoard[x+1][y].equals("3")) {
														break;
													}
												}
											}
										}
										
									}
									for(int i = 0; i < counter; i++) {
										viewBoard[x][y+i] = saveBoard[x][y];
									}
									for(int i = 0; i < counter; i++) {
										saveBoard[x][y+i] = "-";
									}
									return counter;
								}
							}
						}
					}
				}
			}
		}
		return 0;
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
	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void fakeLoad(String sentence) {
		for(int i = 0; i < 3; i++) {
			System.out.print(sentence);
			for(int j = 0; j < 3; j++) {
				pause(300);
				System.out.print(".");
			}
			pause(300);
			clear();
		}
	}
	public static void copyBoard(String[][] cBoard, String[][] vBoard) {
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				vBoard[x][y] = cBoard[x][y];
			}
		}
	}
}