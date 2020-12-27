import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;

public class russianRoulette {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop3 = true;
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
		deathMessage.add(" has been killed in action");
		int turn = 0;
		while(loop3) {
			boolean loop1 = true;
			type("Add a character: ");
			String characterName = scan.next();
			characters.add(characterName);
			System.out.println();
			while(loop1) {
				type("Are you done: ");
				String start = scan.next();
				if(start.equalsIgnoreCase("yes")) {
					loop3 = false;
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
		randomQuote.add(" is sweating profusely");
		randomQuote.add(" is biting their fingernails");
		randomQuote.add(" is falling asleep");
		randomQuote.add(" asks if anyone would rather play rock paper scissors");
		randomQuote.add(" asks if a slice of pizza is really worth this");
		randomQuote.add(" starts to cry");
		randomQuote.add(" stares into " + characters.get(Placeholder) + "'s lifeless eyes");
		randomQuote.add(" is starting to smell bad");
		randomQuote.add(" throws up");
		randomQuote.add(" is considering their life choices");
		boolean loop = true;
		while(loop) {
			System.out.println();
			type("Do you want to play with random bullets (random), a set place (set), or quit (quit): ");
			String gameMode = scan.next();
			boolean loop1 = true;
			int deathChecker = 1;
			if(gameMode.equalsIgnoreCase("random")) {
				System.out.println();
				typeln("It's " + characters.get(turn) + "'s turn");
				while(loop1) {
					System.out.println();
					Random rand = new Random();
					int theBullet = rand.nextInt(6);
					int spin = rand.nextInt(6);
					int death = rand.nextInt(9);
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
						if(characters.size() == 0) {
							if(characters.size() == 0) {
								System.out.println();
								typeln("There are no winners");
								System.out.println();
								typeln("I don't  really know what to say");
								System.out.println();
								typeln("What did you expect from playing with one person?");
								System.out.println();
								typeln("Idiot");
							}
							else {
								System.out.println();
								typeln(characters.get(0) + " won, but at what cost?");
								System.out.println();
								if(graveyard.size() == 1) {
									type(graveyard.get(0) + " will be remembered");
								}
								else if(graveyard.size() == 2) {
									type(graveyard.get(0) + " and " + graveyard.get(1) + " will be remembered");
								}
								else {
									for(int i = 0; i<graveyard.size(); i++) {
										if(i + 1 == graveyard.size()) {
											typeln("and " + graveyard.get(i) + " will be remembered");
										}
										else {
											type(graveyard.get(i) + ", ");
										}
									}
								}
							}
							System.out.println();
							type("Press Enter to continue...");
					        try {
					            int read = System.in.read(new byte[2]);
					        } catch (Exception e) {
					            e.printStackTrace();
					        }
					        loop = true;
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
					int choosePath = rand.nextInt(3);
					int randCharacter = rand.nextInt(characters.size());
					int funnyChooser = 0;
					boolean loop2 = true;
					if(choosePath == 1) {
						if(characters.size() == 1) {
							funnyChooser = rand.nextInt(3);
							typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							System.out.println();
						}
						else {
							funnyChooser = rand.nextInt(5);
							typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							System.out.println();
						}		
					}
					else { 
						if(graveyard.size() > 0) {
							while(loop2) {
								funnyChooser = rand.nextInt(10);
								if(funnyChooser > 4) {
									loop2 = false;
								}
							}
							Placeholder = rand.nextInt(graveyard.size());
							typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							System.out.println();
						}
					}
					/*
					System.out.println(turn);
					System.out.println(characters.size());
					System.out.println(deathChecker);
					*/
					if(characters.size() > 1) {
						if(turn + 1 <= characters.size()) {
							if(deathChecker == 1) {
								typeln(characters.get(turn) + " picks up the gun from " + graveyard.get(graveyard.size() - 1) + "'s limp hand");
								System.out.println();
							}
							else {
								if(turn + 1 < characters.size()) {
									typeln(characters.get(turn) + " hands the gun to " + characters.get(turn + 1));
									System.out.println();
									turn++;
								}
								else {
									if(deathChecker == 1) {
										typeln(characters.get(0) + " picks up the gun from " + graveyard.get(graveyard.size() - 1) + "'s limp hand");
										System.out.println();
									}
									else {
										typeln(characters.get(turn) + " hands the gun to " + characters.get(0));
										System.out.println();
									}
									turn = 0;
								}
							}
						}
						else {
							if(deathChecker == 1) {
								typeln(characters.get(0) + " picks up the gun from " + graveyard.get(graveyard.size() - 1) + "'s limp hand");
								System.out.println();
							}
							else {
								typeln(characters.get(turn) + " hands the gun to " + characters.get(0));
								System.out.println();
							}
							turn = 0;
						}
					}
					//System.out.println(turn);
					type("Press Enter to continue...");
			        try {
			            int read = System.in.read(new byte[2]);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
				}
			}
			else if(gameMode.equalsIgnoreCase("set")) {
				loop = false;
			}
			else if(gameMode.equalsIgnoreCase("quit")) {
				break;
			}
			else {
				System.out.println();
				typeln("That is not a valid option");
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
				Thread.sleep(50);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(25);
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
				Thread.sleep(50);
				}
				catch(InterruptedException e){
				}
			}
			else{
				try{
					Thread.sleep(25);
					}
					catch(InterruptedException e){
					}
			}
		}
		System.out.println();
	}
}
