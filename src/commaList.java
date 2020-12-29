import java.util.ArrayList;
import java.util.Scanner;

public class commaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> commaList = new ArrayList<String>();
		System.out.print("Enter things separated by commas: ");
		String listBeta = scan.nextLine();
		String list = removeWhiteSpaces(listBeta).toLowerCase();
		int counter = 0;
		int commaNumber = 0;
		for(int i = 0; i<list.length(); i++) {
			if(list.charAt(counter) == ',') {
				commaNumber++;
			}
			counter++;
		}
		System.out.println(commaNumber);
		counter = 0;
		for(int i = 0; i<commaNumber; i++) {
			if(list.charAt(counter) == ',') {
				
			}
		}
		
		
		
		scan.close();
	}
	
	private static String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }
}
