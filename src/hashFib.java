import java.util.Scanner;

public class hashFib {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean trueLoop = true;
		while(trueLoop) {
			hashmap Hashmap = new hashmap();
			int finalPlace = 0;
			int num1 = 1;
			int num2 = 1;
			int place = 2;
			boolean finalLoop = true;
			int quit = 0;
			boolean loop = true;
			while(loop) {
				System.out.print("What place do you want to see the number for: ");
				String alphaPlace = scan.next();
				if(alphaPlace.matches(".*[a-z].*")) {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
					continue;
				}
				else if(alphaPlace.matches(".*[^A-Za-z0-9 ].*")) {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
					continue;
				}
				else {
					finalPlace = Integer.parseInt(alphaPlace);  
					loop = false;
				}
			}
			if(finalPlace == 0) {
				System.out.println("The number there is 0");
			}
			else if(finalPlace == 1) {
				System.out.println("The number there is 1");
			}
			else {
				for(int j = 0; j < finalPlace; j++) {
					Hashmap.add(place, num1);
					num1 = num1 + num2;
					num2 = num1 - num2;
					place++;
				}
				
				
				
				
				
				
				
				
				
				
				
				
			}
			while(finalLoop) {
				System.out.print("Do you want to find another number (yes) (no): ");
				String restart = scan.next();
				if(restart.equalsIgnoreCase("yes")) {
					System.out.println();
					finalLoop = false;
					quit = 0;
				}
				else if(restart.equalsIgnoreCase("no")) {
					finalLoop = false;
					quit = 1;
				}
				else {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
				}
			}
			if(quit == 1) {
				trueLoop = false;
			}
		}
		scan.close();
	}
	
}