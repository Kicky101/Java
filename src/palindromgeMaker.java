import java.util.Scanner;

public class palindromgeMaker {
	public static void main(String[] args) {
		int palindrome = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert your word: ");
		String wordBeta = scan.nextLine();
		String word = removeWhiteSpaces(wordBeta).toLowerCase();
		
		if(word.length() % 2 == 0) {
			boolean loop = true;
			boolean loop1 = true;
			int x = 0;
			char placeholder = word.charAt(word.length()-x);
			while(loop) { 
				int counter = 0;
				while(loop1) {
					if(counter == word.length()) {
						palindrome = 0;
						loop1 = false;
					}
					else if(counter == word.length()-x) {
						x++;
						continue;
					}
					else if(word.charAt(counter) == word.charAt(word.length()-x)) {
						if(word.charAt(word.length()-x) == placeholder) {
							x++;
							continue;
						}
						palindrome = 1;
						loop1 = false;
					}
					counter++;
				}
				if(palindrome == 0) {
					loop = false;
				}
				x++;
			}
		}
		else {
			
		}
		if(palindrome == 1) {
			
		}
		else {
			System.out.println(wordBeta + " cannot be converted into a palindrome");
		}
	}
	
	private static String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }
}
