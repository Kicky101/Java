import java.util.ArrayList;
import java.util.Scanner;

public class commaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> commaList = new ArrayList<String>();
		System.out.print("Enter things separated by commas: ");
		String list = scan.nextLine();
		String tempString = "";
		Scanner scann = new Scanner(list);
		scann.useDelimiter(",");
		while(scann.hasNext()) {
			tempString = scann.next();
			tempString = tempString.trim();
			commaList.add(tempString);
		}
		System.out.println();
		System.out.println(commaList);
		scan.close();
		scann.close();
	}
}