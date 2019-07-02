import java.util.Scanner;

import java.util.Random;

public class room {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] room = new String[10][10]; //[y][x]
		int[]playerCoords = new int[2];
		int[]goalCoords = new int[2];
		Random rand = new Random();
		while(true) {
			room = setupRoom(room,playerCoords,goalCoords);
		}
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
