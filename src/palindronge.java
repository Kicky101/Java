import java.util.Scanner;

public class palindronge {
	public static void main(String[] args) {
		int palindrome = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert your word: ");
		String wordBeta = scan.nextLine();
		String word = removeWhiteSpaces(wordBeta).toLowerCase();
		int x = 0;
		for(int i = 0; i < word.length(); i++) {   
			if(word.charAt(i) != ' ') {
				x++;
			}
        }
		
		if(x % 2 == 0) {
			int middle = x / 2;
			boolean loop = true;
			int counter = 0;
			while(loop) {
				if(counter == middle-1) {
					palindrome = 1;
					loop = false;
				}
				else if(word.charAt(counter) == word.charAt(x-1)) {
					counter++;
					x = x - 1;
				}
				else {
					loop = false;
				}
			}
		}
		else {
			int middle = x+1;
			middle = middle / 2;
			boolean loop = true;
			int counter = 0;
			while(loop) {
				if(counter == middle-1) {
					palindrome = 1;
					loop = false;
				}
				else if(word.charAt(counter) == word.charAt(x-1)) {
					counter++;
					x = x - 1;
				}
				else {
					loop = false;
				}
			}
		}
		System.out.println();
		if(palindrome == 1) {
			System.out.println(wordBeta + " is a palindrome");
		}
		else {
			System.out.println(wordBeta + " is not a palindrome");
		}
		scan.close();
	}
	
	private static String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }
}
