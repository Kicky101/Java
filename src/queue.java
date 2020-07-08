import java.util.Scanner;

public class queue {
	public static void main(String[] args) {
		int[] theQueue = new int[100];
		Scanner scan = new Scanner(System.in);
		int queueNumber = 1;
		int queuePlace = 0;
		int queueRemove = 0;
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				theQueue[queuePlace] = queueNumber;
				queueNumber++;
				queuePlace++;
				System.out.println("");
				System.out.println("The queue contains:");
				System.out.println("");
				for(int i = 0; i < queueNumber; i++) {
					if(theQueue[i] != 0) {
						System.out.println(theQueue[i]);
					}
				}
				System.out.println("");
			}
			else if(control.toLowerCase().equals("remove")) {
				theQueue[queueRemove] = 0;
				queueRemove++;
				System.out.println("");
				System.out.println("The queue contains:");
				System.out.println("");
				for(int i = 0; i < queueNumber; i++) {
					if(theQueue[i] != 0) {
						System.out.println(theQueue[i]);
					}
				}
				System.out.println("");
			}
			else if(control.toLowerCase().equals("quit")) {
				System.out.println("");
				System.out.println("The final queue contains:");
				System.out.println("");
				for(int i = 0; i < queueNumber; i++) {
					if(theQueue[i] != 0) {
						System.out.println(theQueue[i]);
					}
				}
				System.out.println("");
				loop = false;
			}
			else {
				System.out.println("");
			}
			if(theQueue[99] != 0) {
				loop = false;
			}
		}
		scan.close();
	}
}
