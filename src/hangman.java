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
			String guess = "";
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
				while(loop) {
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
					System.out.println(screenWord);
					System.out.println();
					System.out.println("You have " + lives + " lives");
					System.out.println();
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
					boolean loop1 = true;
					while(loop1) {
						System.out.println();
						System.out.print("Please guess a letter: ");
						guess = scan.next();
						if(guess.length() > 1) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						if(guess.matches(".*\\d.*")) {
							System.out.println();
							System.out.println("That is not a valid input");
							continue;
						}
						
					}
					
					
					
					
					
					
					loop = false;
				}
			}


			
			
			
			
			trueLoop = false;
		}
		scan.close();
	}
}
