import java.util.Scanner;

public class reecursion2 {
	public static void repeat(int start, int stop, int increase) {
		if(start == stop) {
			System.out.println(start);
		}
		else {
			System.out.println(start);
			repeat(start + increase, stop, increase);
		}
	}
	public static int factorial(int num1) {
		if(num1 == 0) {
			return 0;
		}
		else if(num1 == 1) {
			return 1;
		}
		else {
			return num1*factorial(num1-1);
		}
	}
	public static int fibonacci(int place) {
		if(place == 1) {
			return 1;
		}
		else if(place == 2) {
			return 1;
		}
		else {
			return fibonacci(place-1)+fibonacci(place-2);
		}
	}
	public static void printFibonacci(int place) {
		for(int i = 0; i < place; i++) {
			System.out.println(fibonacci(i));
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop = true) {
			System.out.print("Do you want to make funny big number (1), make funny big sequence (2), or quit (3): ");
			int start = scan.nextInt();
			System.out.println("");
			if(start == 1) {
				System.out.print("What number would you like to disgrace: ");
				int num1 = scan.nextInt();
				System.out.println("");
				System.out.println(factorial(num1));
				System.out.println("");
			}
			else if(start == 2) {
				System.out.print("What number would you like to go up to in the funny sequence: ");
				int place = scan.nextInt();
				System.out.println("");
				printFibonacci(place);
				System.out.println("");
			}
			else if(start == 3) {
				System.out.println("");
				break;
			}
			else {
				continue;
			}
		}
		scan.close();
	}
}
