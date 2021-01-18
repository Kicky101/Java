import java.util.ArrayList;

import java.util.Scanner;

public class consecutiveFinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean trueLoop = true;
		while(trueLoop) {
			int num = 0;
			int coolChecker = 0;
			int nothingChecker = 0;
			int conChecker = 0;
			String cons = "";
			String sameChecker = "";
			int counter = 0;
			int repeat = 1;
			ArrayList<Integer> consList = new ArrayList<Integer>();
			int quit = 0;
			boolean finalLoop = true;
			boolean loop = true;
			while(loop) {
				System.out.print("Insert your number: ");
				String alphaNum =  scan.next();
				if(alphaNum.matches(".*[a-z].*")) {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
					continue;
				}
				if(alphaNum.matches(".*[^A-Za-z0-9 ].*")) {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
					continue;
				}
				else if(alphaNum.equals("0")) {
					System.out.println();
					System.out.println("That number can't be used");
					System.out.println();
					continue;
				}
				else {
					num = Integer.parseInt(alphaNum);  
					loop = false;
				}
			}
			System.out.println();
			if(num == 1) {
				System.out.println("No sets of consecutive numbers add up to 1");
			}
			else if(num == 2) {
				System.out.println("No sets of consecutive numbers add up to 2");
			}
			else {
				while(repeat == 1) {
					coolChecker = 0;
					nothingChecker = 0;
					conChecker = 0;
					cons = "";
					counter = 0;
					consList.clear();
					for(int i = 1; i < num; i++) {
						conChecker = i;
						counter = conChecker + 1;
						for(int j = 1; j < num; j++) {
							conChecker = conChecker + counter;
							counter++;
							if(conChecker == num) {
								conChecker = i;
								for(int n = 0; n < j+1; n++) {
									consList.add(conChecker);
									conChecker = conChecker + 1;
								}
								conChecker = i;
								j = num;
								i = num;
							}
							else if(conChecker > num) {
								j = num;
								conChecker = num;
							}
						}
					}
					if(conChecker == num) {
						repeat = 0;
						coolChecker = 1;
						nothingChecker = 1;
					}
					for(int i = 0; i < consList.size(); i++) {
						if(cons.equals("")) {
							cons = "" + consList.get(i);
						}
						else {
							cons = cons + ", " + consList.get(i);
						}
					}
					System.out.println(sameChecker);
					System.out.println(cons);
					if(sameChecker.equals(cons)) {
						repeat = 0;
					}
					sameChecker = cons;
					if(repeat == 1 && nothingChecker == 0) {
						if(coolChecker == 0) {
							System.out.println("One set of numbers that add up to " + num + " are: " + cons);
						}
						else {
							System.out.println("Another set of numbers that add up to " + num + " are: " + cons);
						}
					}
					if(nothingChecker == 1) {
						repeat = 0;
						System.out.println("No sets of consecutive numbers add up to " + num);
					}
				}
			}
			System.out.println();
			while(finalLoop) {
				System.out.print("Do you want to enter another number (yes) (no): ");
				String restart =  scan.next();
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