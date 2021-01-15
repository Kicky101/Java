import java.util.Scanner;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Random;

public class hangman {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		scan.useDelimiter("\r\n");
		Scanner fileReader = fileReaderMethod();
		boolean trueLoop = true;
		boolean loop = true;
		int quit = 0;
		int playerMode = 0;
		int justWon = 0;
		int score = 0;
		while(trueLoop) {
			if(justWon == 0) {
				while(loop) {
					System.out.print("Do you want to start (start) or quit (quit): ");
					String start = scan.next();
					if(start.equalsIgnoreCase("start")) {
						System.out.println();
						loop = false;
					}
					else if(start.equalsIgnoreCase("quit")) {
						trueLoop = false;
						quit = 1;
						break;
					}
					else {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
						continue;
					}
				}
				if(quit == 1) {
					break;
				}
				loop = true;
				while(loop) {
					System.out.print("Do you want to play with one player (1) or two players (2): ");
					String player = scan.next();
					if(player.equals("1")) {
						System.out.println();
						playerMode = 1;
						loop = false;
					}
					else if(player.equals("2")) {
						playerMode = 2;
						System.out.println();
						loop = false;
					}
					else {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
						continue;
					}
				}
			}
			else {
				playerMode = 1;
			}
			int counter = 0;
			int lives = 6;
			String word = "";
			String screenWord = "";
			String stringGuess = "";
			String screenGuess = "";
			String alreadyGuessed = "";
			int alreadyGuessedCheck = 0;
			String tempString = "";
			String gameMode = "";
			String hiddenWord = "";
			int win = 0;
			char guess = 0;
			int guessCheck = 1;
			if(playerMode == 1) {
				boolean loop1 = true;
				if(justWon == 0) {
					while(loop1) {
						System.out.print("Do you want to make the word (make) or guess the word (guess): ");
						gameMode = scan.next();
						if(gameMode.equalsIgnoreCase("make")) {
							System.out.println();
							System.out.println("I can't be bothered to code a crappy AI right now");
							System.out.println();
							continue;
						}
						else if(gameMode.equalsIgnoreCase("guess")) {
							loop1 = false;
							loop = false;
						}
						else {
							System.out.println();
							System.out.println("That is not a valid input");
							System.out.println();
							continue;
						}
					}
				}
				else {
					gameMode = "guess";
				}
				justWon = 0;
			}
			loop = true;
			while(loop) {
				if(playerMode == 2 || gameMode.equalsIgnoreCase("make")) {
					System.out.print("Player 1, please input your word: ");
					word = scan.next();
					word = word.trim();
					if(word.equals("")) {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
						continue;
					}
					if(word.matches(".*\\d.*")) {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
						continue;
					}
					if(!word.matches(".*[a-z].*")) {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
						continue;
					}
					else {
						loop = false;
					}
				}
				else {
					//fileReader.useDelimiter("\r\n");
					int stopper = 0;
					stopper = rand.nextInt(77718);
					stopper++;
					for(int i = 0; i < stopper; i++) {
						word = fileReader.next();
					}
					loop = false;
				}
			}
			String finishWord = word;
			word = word.toUpperCase();
			int start = 0;
			int end = 0;
			for(int i = 0; i < word.length() - 1; i++) {
				start = i;
				end = i + 1;
				if(i == 0) {
					hiddenWord = word.substring(start, end);
				}
				hiddenWord = hiddenWord + " " + word.substring(start, end);
			}
			for(int i = 0; i < 50; i++) {
				System.out.println();
			}
			System.out.println();
			loop = true;
			for(int i = 0; i < word.length(); i++) {
				tempString = "" + word.charAt(counter);
				if(tempString.matches("[^A-Za-z0-9 ]")) {
					if(counter == 0) {
						screenWord = tempString;
					}
					else {
						screenWord = screenWord + " " + tempString;
					}
				}
				else if(word.charAt(counter) != ' ') {
					if(counter == 0) {
						screenWord = "_";
					}
					else {
						screenWord = screenWord + " _";
					}
				}
				else {
					screenWord = screenWord + "  ";
				}
				counter++;
			}
			while(loop) {
				if(gameMode.equalsIgnoreCase("make")) {
					System.out.println(hiddenWord);
					System.out.println();
				}
				System.out.println(screenWord);
				System.out.println();
				stickGuyArt(lives);
				System.out.println();
				if(gameMode.equalsIgnoreCase("make")) {
					System.out.println("The CPU has " + lives + " lives");
				}
				else {
					System.out.println("You have " + lives + " lives");
				}
				System.out.println();
				if(gameMode.equalsIgnoreCase("make")) {
					System.out.println("The CPU has used " + alreadyGuessed);
				}
				else {
					System.out.println("You have used: " + alreadyGuessed);
				}
				if(lives == 0) {
					if(gameMode.equalsIgnoreCase("make")) {
						System.out.println();
						System.out.println("You win!");
						System.out.println();
						break;
					}
					else if(gameMode.equalsIgnoreCase("guess")) {
						System.out.println();
						System.out.println("The CPU wins!");
						System.out.println();
						System.out.println("The word was " + finishWord);
						System.out.println();
						if(score > 0) {
							System.out.println("Your score was " + score);
							System.out.println();
						}
						
						score = 0;
						break;
					}
					else {
						System.out.println();
						System.out.println("Player 1 wins!");
						System.out.println();
						System.out.println("The word was " + finishWord);
						System.out.println();
						break;
					}
				}
				for(int i = 0; i < screenWord.length(); i++) {
					if(screenWord.charAt(i) != '_') {
						win++;
					}
				}
				if(win == screenWord.length()) {
					if(gameMode.equalsIgnoreCase("make")) {
						System.out.println();
						System.out.println("The CPU wins!");
						System.out.println();
						break;
					}
					else if(gameMode.equalsIgnoreCase("guess")) {
						System.out.println();
						System.out.println("You win!");
						System.out.println();
						boolean finalLoop = true;
						int finalQuit = 0;
						while(finalLoop) {
							System.out.print("Do you want to keep your streak (keep) or go back to the beginning (leave): ");
							String scoreKeep = scan.next();
							if(scoreKeep.equalsIgnoreCase("leave")) {
								score = 0;
								finalQuit = 1;
								finalLoop = false;
								System.out.println();
								if(score > 0) {
									System.out.println("Your score was " + score);
									System.out.println();
								}
								score = 0;
							}
							else if(scoreKeep.equalsIgnoreCase("keep")) {
								justWon = 1;
								score++;
								System.out.println();
								finalQuit = 1;
								finalLoop = false;
							}
							else {
								System.out.println();
								System.out.println("That is not a valid input");
								System.out.println();
								continue;
							}
						}
						if(finalQuit == 1) {
							break;
						}
					}
					else {
						System.out.println();
						System.out.println("Player 2 wins!");
						System.out.println();
						break;
					}
				}
				win = 0;
				boolean loop1 = true;
				if(justWon == 1) {
					loop1 = false;
				}
				while(loop1) {
					System.out.println();
					if(gameMode.equalsIgnoreCase("make")) {
						//CPU guesses word
						/*
						int vowelsPresent = 0;
						int vowelChooser = 0;
						String vowelGuesser = "";
						int blankChecker = 0;
						int repeat = 0;
						boolean loop2 = true;
						while(loop2) {
							for(int i = 0; i < screenWord.length(); i++) {
								if(screenWord.charAt(i) == 'a' || screenWord.charAt(i) == 'e' || screenWord.charAt(i) == 'i' || screenWord.charAt(i) == 'o' || screenWord.charAt(i) == 'u') {
									vowelsPresent++;
								}
							}
							for(int i = 0; i < screenWord.length(); i++) {
								if(screenWord.charAt(i) == '_') {
									blankChecker++;
								}
							}
							if(blankChecker == word.length()) {
								vowelChooser = rand.nextInt(5);
								stringGuess = vowelChoosing(vowelChooser, stringGuess);
							}
							if(vowelsPresent < 5 && word.length() > 11 && word.length() < 21) {
								vowelChooser = rand.nextInt(5);
								stringGuess = vowelChoosing(vowelChooser, stringGuess);
							}
							guess = stringGuess.toUpperCase().charAt(0);
							for(int i = 0; i < alreadyGuessed.length(); i++) {
								if(word.charAt(i) == guess) {
									repeat = 1;
								}
							}
							guess = stringGuess.charAt(0);
							if(repeat == 1) {
								continue;
							}
							else {
								loop2 = false;
							}
						}
						*/
					}
					else {
						System.out.print("Please guess a letter: ");
						stringGuess = scan.next();
						if(stringGuess.length() > 1) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						if(stringGuess.equals("")) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						if(!stringGuess.matches(".*[a-z].*")) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						if(stringGuess.matches(".*\\d.*")) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						guess = stringGuess.toUpperCase().charAt(0);
						for(int i = 0; i < alreadyGuessed.length(); i++) {
							if(alreadyGuessed.charAt(i) == guess) {
								System.out.println();
								System.out.println("You have already guessed this letter");
								alreadyGuessedCheck = 1;
							}
						}
						if(alreadyGuessedCheck == 1) {
							alreadyGuessedCheck = 0;
							continue;
						}
					}
					loop1 = false;
				}
				System.out.println();
				counter = 0;
				int screenCounter = 0;
				screenGuess = stringGuess.toUpperCase();
				guessCheck = 0;
				String oldScreenWord = screenWord;
				for(int i = 0; i < word.length(); i++) {
					if(justWon == 1) {
						break;
					}
					tempString = "" + word.charAt(counter);
					if(tempString.matches("[^A-Za-z0-9 ]")) {
						if(counter == 0) {
							screenWord = tempString;
						}
						else {
							screenWord = screenWord + " " + tempString;
						}
					}
					else if(word.charAt(counter) == guess) {
						guessCheck = 1;
						if(counter == 0) {
							screenWord = screenGuess;
						}
						else {
							screenWord = screenWord + " " + screenGuess;
						}
					}
					else if(word.charAt(counter) == ' ') {
						screenWord = screenWord + "  ";
					}
					else {
						if(oldScreenWord.charAt(screenCounter) == '_') {
							if(counter == 0) {
								screenWord = "_";
							}
							else {
								screenWord = screenWord + " _";
							}
						}
						else {
							if(counter == 0) {
								screenWord = "" + oldScreenWord.charAt(screenCounter);
							}
							else {
								screenWord = screenWord + " " + oldScreenWord.charAt(screenCounter);
							}
						}
					}
					counter++;
					screenCounter = screenCounter + 2;
				}
				if(guessCheck == 0) {
					lives--;
				}
				if(alreadyGuessed == "") {
					alreadyGuessed = screenGuess;
				}
				else {
					alreadyGuessed = alreadyGuessed + ", " + screenGuess;
				}
				for(int i = 0; i < 50; i++) {
					System.out.println();
				}
			}
			fileReader.close();
			fileReader = fileReaderMethod();
		}		
		scan.close();
		fileReader.close();
	}
	
	private static void stickGuyArt(int lives) {
		if(lives == 6) {
			System.out.println(" _____");
			System.out.println(" |   |");
			System.out.println(" |    ");
			System.out.println(" |    ");
			System.out.println(" |    ");
			System.out.println(" |    ");
			System.out.println("_|_   ");
		}
		if(lives == 5) {
			System.out.println(" _____ ");
			System.out.println(" |   | ");
			System.out.println(" |   O ");
			System.out.println(" |     ");
			System.out.println(" |     ");
			System.out.println(" |     ");
			System.out.println("_|_    ");
		}
		if(lives == 4) {
			System.out.println(" _____  ");
			System.out.println(" |   |  ");
			System.out.println(" |   O  ");
			System.out.println(" |   |  ");
			System.out.println(" |   |  ");
			System.out.println(" |      ");
			System.out.println("_|_     ");
		}
		if(lives == 3) {
			System.out.println(" _____    ");
			System.out.println(" |   |    ");
			System.out.println(" |   O    ");
			System.out.println(" |   |\\  ");
			System.out.println(" |   |    ");
			System.out.println(" |        ");
			System.out.println("_|_       ");
		}
		if(lives == 2) {
			System.out.println(" _____    ");
			System.out.println(" |   |    ");
			System.out.println(" |   O    ");
			System.out.println(" |  /|\\  ");
			System.out.println(" |   |    ");
			System.out.println(" |        ");
			System.out.println("_|_       ");
		}
		if(lives == 1) {
			System.out.println(" _____    ");
			System.out.println(" |   |    ");
			System.out.println(" |   O    ");
			System.out.println(" |  /|\\  ");
			System.out.println(" |   |    ");
			System.out.println(" |    \\  ");
			System.out.println("_|_       ");
		}
		if(lives == 0) {
			System.out.println(" _____    ");
			System.out.println(" |   |    ");
			System.out.println(" |   O    ");
			System.out.println(" |  /|\\  ");
			System.out.println(" |   |    ");
			System.out.println(" |  / \\  ");
			System.out.println("_|_       ");
		}
	}
	
	private static String vowelChoosing(int vowelChooser, String stringGuess) {
		if(vowelChooser == 0) {
			stringGuess = "a";
		}
		if(vowelChooser == 1) {
			stringGuess = "e";
		}
		if(vowelChooser == 2) {
			stringGuess = "i";
		}
		if(vowelChooser == 3) {
			stringGuess = "o";
		}
		if(vowelChooser == 4) {
			stringGuess = "u";
		}
		return stringGuess;
	}
	
	private static Scanner fileReaderMethod() {
		Scanner fileReader;
		fileReader = null;
		try {
			fileReader = new Scanner(new File("C:\\Users\\hucki\\OneDrive\\Desktop\\Text files\\usa2.txt"));
		}
		catch(FileNotFoundException e){	
			System.err.println("The file was not found");
			System.err.println("Please restart the program");
		}
		return fileReader;
	}
}
