import java.util.Scanner;

public class hangman {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\r\n");
		boolean trueLoop = true;
		boolean loop = true;
		int quit = 0;
		while(trueLoop) {
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
			int playerMode = 0;
			while(loop) {
				System.out.print("Do you want to play with one player (1) or two players (2): ");
				String player = scan.next();
				if(player.equals("1")) {
					System.out.println("wait for me to code cpu first");
					playerMode = 1;
					trueLoop = false;
					break;
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
			int counter = 0;
			int lives = 6;
			String word = "";
			String screenWord = "";
			String stringGuess = "";
			String screenGuess = "";
			String alreadyGuessed = "";
			int alreadyGuessedCheck = 0;
			String tempString = "";
			int win = 0;
			char guess = 0;
			int guessCheck = 1;
			if(playerMode == 1) {
				//ADD CPU INPUTS!!!!
				//do you wanna be the person that makes the word or guess the word
				break;
			}
			else {
				loop = true;
				while(loop) {
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
					else {
						loop = false;
					}
				}
				String finishWord = word;
				word = word.toUpperCase();
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
					System.out.println(screenWord);
					System.out.println();
					stickGuyArt(lives);
					System.out.println();
					System.out.println("You have " + lives + " lives");
					System.out.println();
					System.out.println("You have used: " + alreadyGuessed);
					if(lives == 0) {
						System.out.println();
						System.out.println("Player 1 wins!");
						System.out.println();
						System.out.println("The word was " + finishWord);
						System.out.println();
						break;
					}
					for(int i = 0; i < screenWord.length(); i++) {
						if(screenWord.charAt(i) != '_') {
							win++;
						}
					}
					if(win == screenWord.length()) {
						System.out.println();
						System.out.println("Player 2 wins!");
						System.out.println();
						break;
					}
					win = 0;
					boolean loop1 = true;
					while(loop1) {
						System.out.println();
						System.out.print("Please guess a letter: ");
						stringGuess = scan.next();
						stringGuess = stringGuess.toUpperCase();
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
						if(stringGuess.matches(".*\\d.*")) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						guess = stringGuess.charAt(0);
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
						loop1 = false;
					}
					System.out.println();
					counter = 0;
					int screenCounter = 0;
					screenGuess = stringGuess.toUpperCase();
					guessCheck = 0;
					String oldScreenWord = screenWord;
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
			}
		}
		scan.close();
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
}
