import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;

public class russianRoulette {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int Placeholder = 0;
		ArrayList<String> characters = new ArrayList<String>();
		ArrayList<String> graveyard = new ArrayList<String>();
		ArrayList<String> deathMessage = new ArrayList<String>();
		ArrayList<String> randomQuote = new ArrayList<String>();
		deathMessage.add(" lost in a glorious fashion");
		deathMessage.add(" exploded into bits and pieces");
		deathMessage.add(" is gone for good");
		deathMessage.add(" is missing a head");
		deathMessage.add(" went bing bong bang");
		deathMessage.add(" died an honarable death");
		deathMessage.add(" died at the hands of their worst enemy");
		deathMessage.add(" should've kept the safety on");
		randomQuote.add(" stares into " + characters.get(Placeholder) + "'s lifeless eyes");
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
			boolean loop1 = true;
			int deathChecker = 1;
			if(gameMode.equalsIgnoreCase("random")) {
				typeln("It's " + characters.get(turn) + "'s turn");
				System.out.println();
				while(loop1) {
					System.out.println();
					Random rand = new Random();
					int theBullet = rand.nextInt(6);
					int spin = rand.nextInt(6);
					int death = rand.nextInt(8);
					if(deathChecker == 1) {
						typeln(characters.get(turn) + " loads in a bullet, spins the round, and prepares to fire");
					}
					else {
						typeln(characters.get(turn) + " spins the round and prepares to fire");
					}
					System.out.println();
					if(spin == theBullet) {
						typeln(characters.get(turn) + deathMessage.get(death));
						graveyard.add(characters.get(turn));
						characters.remove(turn);
						if(characters.size() == 1) {
							System.out.println();
							typeln(characters.get(0) + " won, but at what cost?");
							System.out.println();
							for(int i = 0; i<graveyard.size(); i++) {
								if(i + 1 == graveyard.size()) {
									typeln("and " + graveyard.get(i) + " will be remembered");
								}
								else {
									type(graveyard.get(i) + ", ");
								}
							}
							System.out.println();
							break;
						}
						deathChecker = 1;	
					}
					else {
						typeln(characters.get(turn) + " pulls the trigger and nothing happens");
						deathChecker = 0;
					}
					System.out.println();
					// put funny lines here
					int choosePath = rand.nextInt(2);
					if(choosePath == 1) {
						
					}
					else { 
						
					}
					Placeholder = rand.nextInt(graveyard.size());
					if(turn + 1 > characters.size()) {
						if(deathChecker == 1) {
							typeln(characters.get(0) + " picks up the gun from " + characters.get(turn) + "'s limp hand");
						}
						else {
							typeln(characters.get(turn) + " hands the gun to " + characters.get(0));
						}
						turn = 0;
					}
					else {
						if(deathChecker == 1) {
							typeln(characters.get(turn + 1) + " picks up the gun from " + characters.get(turn) + "'s limp hand");
						}
						else {
							typeln(characters.get(turn) + " hands the gun to " + characters.get(turn + 1));
						}
						turn++;
					}
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
