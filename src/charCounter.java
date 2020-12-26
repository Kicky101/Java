import java.util.Scanner;

public class charCounter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert your word: ");
		String word = scan.nextLine();
		int x = 0;
		for(int i = 0; i < word.length(); i++) {   
			if(word.charAt(i) != ' ') {
				x++;
			}
        }
		System.out.println();
		System.out.println(x);
		System.out.println();
		scan.close();
	}
}
