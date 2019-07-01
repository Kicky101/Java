import java.util.Random;

import java.util.Scanner;

public class guessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		int lives = 5;
		int min = 1;
		int max = 100;
		int num = rand.nextInt((max-min)+min)+1;
		while(loop) {
			System.out.print("Enter a number between 1-100: ");
			int guess = scan.nextInt();
			if(guess == (num)) {
				System.out.print("Correct");
				loop = false;
			}
			else {
				System.out.println("Wrong");
				if(guess<(num)) {
					System.out.println("The number is greater than your guess");
				}
				if(guess>(num)) {
					System.out.println("The number is less than your guess");
				}
				lives--;
				if(lives>(0)) {
					System.out.println("You have " + lives +" "+(lives>1 ? "lives" : "life")+" left");
				}
				else {
					System.out.println("You are out of lives");
					System.out.print("The number was " + num);
					loop = false;
				}
			}
		}
		scan.close();
	}

}
