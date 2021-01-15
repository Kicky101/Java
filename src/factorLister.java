import java.util.Scanner;

import java.util.ArrayList;

public class factorLister {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean trueLoop = true;
		while(trueLoop) {
			int num = 0;
			String factors = "";
			ArrayList<Integer> factorsList = new ArrayList<Integer>();
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
				else {
					num = Integer.parseInt(alphaNum);  
					loop = false;
				}
			}
			System.out.println();
			if(num == 0) {
				System.out.println("That number has no factors");
			}
			else if(num == 1) {
				System.out.println("1 is a prime number");
				System.out.println();
				System.out.println("The factors of 1 are: 1");
			}
			else {
				for(int i = 1; i < num; i++) {
					if(num % i == 0) {
						factorsList.add(i);
					}
				}
				factorsList.add(num);
				for(int i = 0; i < factorsList.size(); i++) {
					if(factors.equals("")) {
						factors = "" + factorsList.get(i);
					}
					else {
						factors = factors + ", " + factorsList.get(i);
					}
				}
				if(factorsList.size() == 2) {
					System.out.println(num + " is a prime number");
					System.out.println();
				}
				System.out.println("The factors of " + num + " are: " + factors);
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