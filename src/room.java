import java.util.Scanner;

import java.util.Random;

public class room {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]playerCoords = new int[2];
		int[]goalCoords = new int[2];
		Random rand = new Random();
		while(true) {
			String[][] room = new String[rand.nextInt(50)+1][rand.nextInt(50)+1]; //[y][x]
			int playerX = rand.nextInt((room[0].length)-1)+1;
			int playerY = rand.nextInt((room.length)-1)+1;
			int goalX = rand.nextInt((room[0].length)-1)+1;
			int goalY = rand.nextInt((room.length)-1)+1;
			playerCoords[0] = playerY;
			playerCoords[1] = playerX;
			goalCoords[0] = goalY;
			goalCoords[1] = goalX;
			room = setupRoom(room,playerCoords,goalCoords);
			while(true) {
				printRoom(room);
				System.out.print("Which direction will you go: ");
				String direction = scan.nextLine();
				if(direction.toLowerCase().equals("up") && playerY-1>=0) {
					playerY--;
					playerCoords[0] = playerY;
					room = setupRoom(room,playerCoords,goalCoords);
				}
				else if(direction.toLowerCase().equals("down") && playerY+1<room.length) {
					playerY++;
					playerCoords[0] = playerY;
					room = setupRoom(room,playerCoords,goalCoords);
				}
				else if(direction.toLowerCase().equals("left") && playerX-1>=0) {
					playerX--;
					playerCoords[1] = playerX;
					room = setupRoom(room,playerCoords,goalCoords);
				}
				else if(direction.toLowerCase().equals("right") && playerX+1<room[0].length) {
					playerX++;
					playerCoords[1] = playerX;
					room = setupRoom(room,playerCoords,goalCoords);
				}
				else {
					System.out.println("That is not a valid input");
				}
				if(playerX == goalX && playerY == goalY) {
					printRoom(room);
					System.out.println("You win!");
					break;
				}
			}
			System.out.print("Do you want to keep playing: ");
			String quit = scan.nextLine();
			if(quit.toLowerCase().equals("yes")) {
				continue;
			}
			else if(quit.toLowerCase().equals("no")) {
				break;
			}
		}
		scan.close();
	}
	
	private static String[][]setupRoom(String[][] room, int[] playerCoords, int[] goalCoords) {
		for(int i = 0; i<room.length; i++) {
			for(int j = 0; j<room[0].length; j++) {
				room[i][j] = "-";
			}
		}
		room[playerCoords[0]][playerCoords[1]] = "X";
		room[goalCoords[0]][goalCoords[1]] = "U";
		return room;
	}
	
	private static void printRoom(String[][] room) {
		System.out.println();
		for(int i = 0; i<room.length; i++) {
			for(int j = 0; j<room[0].length; j++) {
				System.out.print(" "+room[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
