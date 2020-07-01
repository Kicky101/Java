
// These "//" things are comments to help you

import java.util.Scanner;

// This is needed to ask questions
// import is something that is used to pull something from the java utilities library
// Basically it's something made by others that we're "stealing", it's not a part of java

import java.util.Random;

// This is needed to generate random numbers

public class eightBallForJessie {
	
// This is just the name of the program
	
	public static void main(String[] args) {
		
	// If you're not making a program that will help other programs, such as a deck program for cards, then use this
	// It's basically necessary for making programs that are supposed to run
		
		Scanner scan = new Scanner(System.in);
		
		// This creates a Scanner, which will be used to ask questions
		
		boolean loop = true;
		
		// This is creating a boolean, which I called "loop" (Just a type of variable that consists of true or false)
		// loop will be used to keep the 8 ball program running unless you tell it to stop
		
		while(loop) {
			
		// Everything inside this will repeat until told otherwise	
		
			System.out.print("Do you want to find your luck: ");
			String generateLuck = scan.next();
			
			// This is the question
			// It asks if you want to stop or not
			// The String means that the answer to the question will be not text
			// If it said int the answer has to be a number
			// *** The reason print is used here instead of println is to have the answer be typed on the same line
			
			if(generateLuck.toLowerCase().equals("yes")) {
				
			// This checks if the answer is yes
			// The .toLowerCase() is a function that converts any text to lower case
			// So "Yes" could become "yes"
			// .equals is basically = for String variables, while == is = for int variables
				
				Random rand = new Random();
				
				// This creates a new Random which can be used to generate random numbers
				
				int luckyNumber = rand.nextInt(100);
				
				// This generates a random number between 0 and 100, and stores it inside of luckyNumber
				
				if(luckyNumber <= 25) {
					
				// <= means less than or equal to
				
					System.out.println("");
					System.out.println("Looks like you'll have bad luck today");
					System.out.println("");
					continue;
					
					// The difference between print and println is that println also prints an enter basically
					// Without println all the text would be on the same line
					// The System.out.println(""); is used to add a space to make it look nice
					// continue; continues the loop, bringing it back to the starting question, where the loop was created
					// Refer to *** on line 43
					
				}
				else if(luckyNumber > 25 && luckyNumber <= 50) {
					System.out.println("");
					System.out.println("Looks like you'll have average luck today");
					System.out.println("");
					continue;
					
					// > means greater than
					// The && means that luckyNumber has to be less than 25 AND also has to be less than or equal to 50
					
				}
				else if(luckyNumber > 50 && luckyNumber <= 75) {
					System.out.println("");
					System.out.println("Looks like you'll have good luck today");
					System.out.println("");
					continue;
				}
				else if(luckyNumber > 75 && luckyNumber <= 99) {
					System.out.println("");
					System.out.println("Looks like you'll have extremely good luck today");
					System.out.println("");
					continue;
				}
				else if(luckyNumber == 100) {
					System.out.println("");
					System.out.println("The God of Luck is alive inside you today");
					System.out.println("");
					continue;
					
					// == means equals 
					
				}
			}
			else if(generateLuck.toLowerCase().equals("no")) {
				break;
			}
			
			// else if is used to check another condition of the same variable
			// This checks if our answer is no, and if so it will stop the loop
			// I suggest using loop = false; instead, it's more reliable, but this works here
			
			else {
				System.out.println("");
				continue;
			}
			
			// If any other answer is given besides yes or no it continues the loop, repeating the question
			
		}
		scan.close();
		
		// This closes the scanner after it's used
		// It's not necessary but reduces any lag, memory usage, etc.
		// If there's stuff here that you don't understand after this, then you might be taking this too fast
		
	}
}
