import java.util.Scanner;

import java.util.ArrayList;

import java.util.Random;

public class russianRoulette {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\r\n");
		boolean trueLoop = true;
		Random rand = new Random();
		while(trueLoop) {
			int Placeholder = 0;
			ArrayList<String> characters = new ArrayList<String>();
			ArrayList<String> graveyard = new ArrayList<String>();
			ArrayList<String> deathMessage = new ArrayList<String>();
			ArrayList<String> randomQuote = new ArrayList<String>();
			characters.clear();
			graveyard.clear();
			deathMessage.clear();
			randomQuote.clear();
			deathMessage.add(" lost in a glorious fashion");
			deathMessage.add(" exploded into bits and pieces");
			deathMessage.add(" is gone for good");
			deathMessage.add(" is missing a head");
			deathMessage.add(" went bing bong bang");
			deathMessage.add(" died an honarable death");
			deathMessage.add(" died at the hands of their worst enemy");
			deathMessage.add(" should've kept the safety on");
			deathMessage.add(" has been killed in action");
			deathMessage.add(" pulls the trigger and dies instantly");
			int turn = 0;
			int quit = 0;
			boolean loop2 = true;
			while(loop2) {
				type("Do you want to start (start) or quit (quit): ");
				String start = scan.next();
				if(start.equalsIgnoreCase("quit")) {
					quit = 1;
					trueLoop = false;
					break;
				}
				else if(start.equalsIgnoreCase("start")) {
					System.out.println();
					loop2 = false;
				}
				else {
					System.out.println();
					typeln("That is not a valid option");
					System.out.println();
					continue;
				}
			}
			if(quit == 1) {
				break;
			}
			type("Add characters separated by commas: ");
			String list = scan.next();
			String tempString = "";
			Scanner scann = new Scanner(list);
			scann.useDelimiter(",");
			while(scann.hasNext()) {
				tempString = scann.next();
				tempString = tempString.trim();
				characters.add(tempString);
			}
			scann.close();
			graveyard.add("");
			randomQuote.add(" is sweating profusely");
			randomQuote.add(" is biting their fingernails");
			randomQuote.add(" is falling asleep");
			randomQuote.add(" asks if anyone would rather play rock paper scissors");
			randomQuote.add(" asks if a slice of pizza is really worth this");
			randomQuote.add(" starts to cry");
			randomQuote.add(" stares into " + graveyard.get(Placeholder) + "'s lifeless eyes");
			randomQuote.add(" throws up");
			randomQuote.add(" is considering their life choices");
			randomQuote.add(" is starting to smell bad");
			graveyard.clear();
			boolean loop = true;
			while(loop) {
				System.out.println();
				String game = "";	
				type("Do you want to play with random bullets (random) or a set place (set): ");
				String gameMode = scan.next();
				if (gameMode.equalsIgnoreCase("random")){
					game = gameMode;
					loop = false;
				}
				else if (gameMode.equalsIgnoreCase("set")){
					game = gameMode;
					loop = false;
				}
				else {
					System.out.println();
					typeln("That is not a valid option");
					continue;
				}				
				boolean loop1 = true;
				int deathChecker = 1;
				int theBullet = 0;
				int spin = 0;
				System.out.println();
				typeln("It's " + characters.get(turn) + "'s turn");
				while(loop1) {
					System.out.println();	
					int death = rand.nextInt(10);
					int suicide = rand.nextInt(5);
					int theDeathCheck = 0;
					if(game.equalsIgnoreCase("random")) {
						theBullet = rand.nextInt(6);
						spin = rand.nextInt(6);
						if(spin == theBullet) {
							theDeathCheck = 1;
						}
					}
					else {
						if(deathChecker == 1) {
							theBullet = rand.nextInt(6);
							spin = rand.nextInt(6);
						}
						else {
							if(spin < 5) {
								spin++;
							}
							else {
								spin = 0;
							}
						}
						if(spin == theBullet) {
							theDeathCheck = 1;
						}
					}
					if(deathChecker == 1) {
						typeln(characters.get(turn) + " loads in a bullet, spins the round, and prepares to fire");
					}
					else {
						if(game.equalsIgnoreCase("random")) {
							typeln(characters.get(turn) + " spins the round and prepares to fire");
						}
						else {
							typeln(characters.get(turn) + " turns the round and prepares to fire");
						}
					}
					System.out.println();
					if(theDeathCheck == 1) {
						typeln(characters.get(turn) + deathMessage.get(death));
						graveyard.add(characters.get(turn));
						characters.remove(turn);
						if(characters.size() <= 1) {
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
									typeln(graveyard.get(0) + " will be remembered");
								}
								else if(graveyard.size() == 2) {
									typeln(graveyard.get(0) + " and " + graveyard.get(1) + " will be remembered");
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
								if(suicide == 4) {
									System.out.println();
									typeln("After all that " + characters.get(0) + " sure doesn't feel like a winner");
									System.out.println();
									typeln(characters.get(0) + " loads a bullet into the gun, turns to it, and shoots themselves in the throat");
									System.out.println();
									typeln(characters.get(0) + " will be remembered");
								}
							}
							System.out.println();
							type("Press Enter to continue...");
					        try {
					            int read = System.in.read(new byte[2]);
					        } catch (Exception e) {
					            e.printStackTrace();
					        }
					        System.out.println();
					        loop = false;
					        loop2 = false;
					        loop1 = false;
							break;
						}
						deathChecker = 1;	
					}
					else {
						typeln(characters.get(turn) + " pulls the trigger and nothing happens");
						deathChecker = 0;
					}
					System.out.println();
					int choosePath = rand.nextInt(3);
					int randCharacter = rand.nextInt(characters.size());
					int funnyChooser = 0;
					loop2 = true;
					if(choosePath == 1) {
						if(characters.size() == 1) {
							funnyChooser = rand.nextInt(3);
							typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							System.out.println();
						}
						else {
							funnyChooser = rand.nextInt(5);
							if(characters.size() == 2) {
								randomQuote.set(3, " asks if " + characters.get(Math.abs(randCharacter - 1)) + " would rather play rock paper scissors");
								typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							}
							else {
								typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							}
							System.out.println();
						}		
					}
					else { 
						if(graveyard.size() > 0) {
							Placeholder = rand.nextInt(graveyard.size());
							while(loop2) {
								funnyChooser = rand.nextInt(10);
								if(funnyChooser > 4) {
									loop2 = false;
								}
							}
							if(funnyChooser == 9) {
								typeln(graveyard.get(Placeholder) + randomQuote.get(funnyChooser));
							}
							else if(funnyChooser == 6) {
								typeln(characters.get(randCharacter) + " stares into " + graveyard.get(Placeholder) + "'s lifeless eyes");
							}
							else {
								typeln(characters.get(randCharacter) + randomQuote.get(funnyChooser));
							}
							System.out.println();
						}
					}
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
					type("Press Enter to continue...");
			        try {
			            int read = System.in.read(new byte[2]);
			        } catch (Exception e) {
			            e.printStackTrace();
			        }	
				}
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
