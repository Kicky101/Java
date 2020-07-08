import java.util.Scanner;

public class stack {
	public static void main(String[] args) {
		int[] theStack = new int[100];
		Scanner scan = new Scanner(System.in);
		int stackAdd = 0;
		int stackPlace = 0;
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				theStack[stackPlace] = stackAdd;
				System.out.println("");
				System.out.println("The stack contains:");
				System.out.println("");
				System.out.println(theStack);
			}
		}	
	}
}
