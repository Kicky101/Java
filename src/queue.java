import java.util.Scanner;

// OH GOD WHAT HAVE I DONE

public class queue {
	public static boolean fullChecker(int[] theQueue) {
		boolean fullChecker = true;
		for(int j = 0; j < theQueue.length; j++) {
			if(theQueue[j] == 0) {
				fullChecker = false;
			}
		}
		return fullChecker;
	}
	
	public static void main(String[] args) {
		int[] theQueue = new int[10];
		Scanner scan = new Scanner(System.in);
		int queueNumber = 1;
		int queuePlace = 0;
		int queueRemove = 0;
		boolean stupidChecker = false;
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				if(fullChecker(theQueue)) {
					System.out.println();
					System.out.println("You need to remove first");
					System.out.println();
					stupidChecker = true;
				}
				else {
					if(stupidChecker || queuePlace == 10 && theQueue[0] == 0) {
						queuePlace = 0;
						stupidChecker = false;
					}
					theQueue[queuePlace] = queueNumber;
					queueNumber++;
					queuePlace++;
					System.out.println("");
					System.out.println("The queue contains:");
					System.out.println("");
					for(int i = 0; i < theQueue.length; i++) {
						if(theQueue[i] != 0) {
							System.out.println(theQueue[i]);
						}
					}
					System.out.println("");
				}
			}
			else if(control.toLowerCase().equals("remove")) {
				if(queueRemove == theQueue.length) {
					queueRemove = 0;
				}
				theQueue[queueRemove] = 0;
				queueRemove++;
				System.out.println("");
				System.out.println("The queue contains:");
				System.out.println("");
				for(int i = 0; i < theQueue.length; i++) {
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
				for(int i = 0; i < theQueue.length; i++) {
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
		}
		scan.close();
	}
}
