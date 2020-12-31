import java.util.Scanner;

public class hangman {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\r\n");
		boolean trueLoop = true;
		boolean loop = true;
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
					break;
				}
				else {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
					continue;
				}
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
			int win = 0;
			char guess = 0;
			int guessCheck = 1;
			if(playerMode == 1) {
				//ADD CPU INPUTS!!!!
				//do you wanna be the person that makes the word or guess the word
				break;
			}
			else {
				System.out.print("Player 1, please input your word: ");
				word = scan.next();
				word = word.trim();
				for(int i = 0; i < 50; i++) {
					System.out.println();
				}
				System.out.println();
				loop = true;
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(counter) != ' ') {
						if(screenWord.equals("")) {
							screenWord = "_";
						}
						screenWord = screenWord + " _";
					}
					else {
						screenWord = screenWord + "  ";
					}
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
						System.out.println("The word was " + word);
						System.out.println();
						break;
					}
					for(int i = 0; i < screenWord.length(); i++) {
						if(screenWord.charAt(i) == '_') {
							win = 0;
						}
						else {
							win = 1;
						}
					}
					if(win == 1) {
						System.out.println();
						System.out.println("Player 2 wins!");
						System.out.println();
					}
					boolean loop1 = true;
					while(loop1) {
						System.out.println();
						System.out.print("Please guess a letter: ");
						stringGuess = scan.next();
						stringGuess.toUpperCase();
						if(stringGuess.length() > 1) {
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
								continue;
							}
						}
					}
					counter = 0;
					screenGuess = stringGuess.toUpperCase();
					guessCheck = 0;
					for(int i = 0; i < word.length(); i++) {
						if(word.charAt(counter) == guess) {
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
							if(counter == 0) {
								screenWord = "_";
							}
							else {
								screenWord = screenWord + " _";
							}
						}
						counter++;
					}
					if(guessCheck == 0) {
						lives--;
					}
					alreadyGuessed = alreadyGuessed + screenGuess + " ";
				}
			}


			
			
			
			
			trueLoop = false;
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
