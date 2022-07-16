import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ships = 1;
		int shipType = 4;
		int x = 0;
		int y = 0;
		int counter = 0;
		boolean horiz = true;
		boolean loop = true;
		for(int i = 0; i < ships; i++) {
			while(loop) { 
				System.out.print("where do you want to place your " + shipType + " ship, and in what orientation (h/v)? (separate by comma. ex: x, y, v): ");
				String playerMove = scan.nextLine();
				counter = 0;
				for(int j = 0; j < playerMove.length(); j++) {
					if(playerMove.substring(j,j+1).equals(",")) {
						counter++;
					}
				}
				if(counter!=2 || playerMove.substring(playerMove.length()-1).equals(",")) {
					System.out.println("\nThat is not a valid input\n");
					counter = 0;
					continue;
				}
				String tempString = "";
				Scanner scann = new Scanner(playerMove);
				scann.useDelimiter(",");
				tempString = scann.next();
				tempString = tempString.trim();
				if(!tempString.matches(".*\\d.*")) {
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				x = Integer.parseInt(tempString);
				tempString = scann.next();
				tempString = tempString.trim();
				if(!tempString.matches(".*\\d.*")) {
					System.out.println("\nThat is not a valid input\n");
					
					continue;
				}
				y = Integer.parseInt(tempString);
				tempString = scann.next();
				tempString = tempString.trim();
				if(tempString.equals("h")) {
					horiz = true;
				}
				else if(tempString.equals("v")) {
					horiz = false;
				}
				else {
					System.out.println("\nThat is not a valid input\n");
					continue;
				}
				scann.close();
				loop = false;
			}
			System.out.println(x);
			System.out.println(y);
			System.out.println(horiz);
			clear();
		}
		scan.close();
	}
	public static void clear() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}