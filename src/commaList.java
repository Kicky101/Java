import java.util.ArrayList;
import java.util.Scanner;

public class commaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> commaList = new ArrayList<String>();
		System.out.print("Enter things separated by commas: ");
		String list = scan.nextLine();
		int counter = 0;
		String tempString = "";
		Scanner scann = new Scanner(list);
		for(int i = 0; i<list.length(); i++) {
			if(list.charAt(counter) == ',') {
				if(counter < list.length()) {
					if(list.charAt(counter + 1) == ' ') {
						int start = counter + 1;
						int end = counter + 2;
						list = list.substring(start-1, end);
					}
				}
				if(counter > 0) {
					if(list.charAt(counter - 1) == ' ') {
						int start = 0;
						int end = counter - 2;
						list = list.substring(start-1, end);
					}
				}
			}
			counter++;
			System.out.println();
			System.out.print(list.charAt(counter));
		}
		scann.useDelimiter(",");
		while(scann.hasNext()) {
			commaList.add(scann.next());
		}
		System.out.println();
		System.out.println(commaList);
		scan.close();
		scann.close();
	}
	
}
