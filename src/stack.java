import java.util.Scanner;

public class stack {
	public static void main(String[] args) {
		int[] theStack = new int[100];
		Scanner scan = new Scanner(System.in);
		int stackNumber = 1;
		int stackPlace = 0;
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				theStack[stackPlace] = stackNumber;
				stackNumber++;
				stackPlace++;
				System.out.println("");
				System.out.println("The stack contains:");
				System.out.println("");
				for(int i = 0; i < stackNumber; i++) {
					if(theStack[i] != 0) {
						System.out.println(theStack[i]);
					}
				}
				System.out.println("");
			}
			else if(control.toLowerCase().equals("remove")) {
				theStack[stackPlace-1] = 0;
				if(stackPlace != 0) {
					stackPlace--;
				}
				System.out.println("");
				System.out.println("The stack contains:");
				System.out.println("");
				for(int i = 0; i < stackNumber; i++) {
					if(theStack[i] != 0) {
						System.out.println(theStack[i]);
					}
				}
				System.out.println("");
			}
			else if(control.toLowerCase().equals("quit")) {
				System.out.println("");
				System.out.println("The final stack contains:");
				System.out.println("");
				for(int i = 0; i < stackNumber; i++) {
					if(theStack[i] != 0) {
						System.out.println(theStack[i]);
					}
				}
				System.out.println("");
				loop = false;
			}
			else {
				System.out.println("");
			}
			if(theStack[99] != 0) {
				loop = false;
			}
		}
		scan.close();
	}
}
