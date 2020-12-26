import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;

public class russianRoulette {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		ArrayList<String> characters = new ArrayList<String>();
		int charIndex = 0;
		int turn = 0;
		while(loop) {
			boolean loop1 = true;
			type("Add a character: ");
			String characterName = scan.next();
			characters.add(characterName);
			System.out.println();
			while(loop1) {
				type("Are you done: ");
				String start = scan.next();
				if(start.equalsIgnoreCase("yes")) {
					System.out.println();
					loop = false;
					break;
				}
				else if(start.equalsIgnoreCase("no")) {
					System.out.println();
					loop1 = false;
				}
				else {
					System.out.println();
					typeln("That is not a valid option");
					System.out.println();
					continue;
				}
			}	
		}
		loop = true;
		while(loop) {
			type("Do you want to play with random bullets (random) or a set place (set): ");
			String gameMode = scan.next();
			if(gameMode.equalsIgnoreCase("random")) {
				System.out.println();
				Random rand = new Random();
				int theBullet = rand.nextInt(6);
				int spin = rand.nextInt(6);
				typeln("It's " + characters.get(charIndex) + "'s turn");
				System.out.println();
				if(spin == theBullet) {
					typeln(characters.get(charIndex) + " lost in a glorious fashion");
				}
			}
			else if(gameMode.equalsIgnoreCase("set")) {
				loop = false;
			}
			else {
				System.out.println();
				typeln("That is not a valid option");
				System.out.println();
				continue;
			}
		}
		scan.close();
	}
	
	private static void type(String hi) {
		for(int i = 0; i<hi.length(); i++) {
			System.out.print(hi.charAt(i));
			if(hi.charAt(i)==' '){
			try{
				Thread.sleep(30);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(15);
					}
					catch(InterruptedException e){
					}
			}
		}
	}
	
	private static void typeln(String hi) {
		for(int i = 0; i<hi.length(); i++) {
			System.out.print(hi.charAt(i));
			if(hi.charAt(i)==' '){
			try{
				Thread.sleep(30);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(15);
					}
					catch(InterruptedException e){
					}
			}
		}
		System.out.println();
	}
}
