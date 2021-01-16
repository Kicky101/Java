import java.util.ArrayList;

import java.util.Scanner;

public class primeFinder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean trueLoop = true;
		while(trueLoop) {
			int num = 0;
			String primes = "";
			ArrayList<Integer> primeList = new ArrayList<Integer>();
			int quit = 0;
			int noPrime = 0;
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
			for(int i = 1; i < num+1; i++) {
				for(int j = 2; j < i-1; j++) {
					if(i % j == 0) {
						noPrime = 1;
					}
				}
				if(noPrime == 0) {
					primeList.add(i);
				}
				noPrime = 0;
			}
			for(int i = 0; i < primeList.size(); i++) {
				if(primes.equals("")) {
					primes = "" + primeList.get(i);
				}
				else {
					primes = primes + ", " + primeList.get(i);
				}
			}
			System.out.println("The prime numbers up to " + num + " are: " + primes);
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
