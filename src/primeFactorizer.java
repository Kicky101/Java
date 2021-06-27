import java.util.ArrayList;
import java.util.Scanner;

public class primeFactorizer {
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
					factorsList.add(num);
					loop = false;
				}
			}
			System.out.println();
			if(num == 0) {
				System.out.println("The prime factorization of 0 is: 0");
			}
			else if(num == 1) {
				System.out.println("The prime factorization of 1 is: 1");
			}
			else {
				factorizer(factorsList);
			}
		}
		scan.close();
	}
	private static ArrayList<Integer> factorizer(ArrayList<Integer> factorList) {
		int placeholder = 0;
		for(int i = 0; i < factorList.size(); i++) {
			for(int j = 2; j < factorList.get(i); j++) {
				if(factorList.get(i) % j == 0) {
					if(factorList.get(i) == j) {
						factorList.add(j);
					}
					else {
						placeholder = factorList.get(i) / j;
						factorList.add(placeholder);
						factorList.add(j);
						factorizer(factorList);
					}
				}
			}
		}
		return factorList;
	}
}
