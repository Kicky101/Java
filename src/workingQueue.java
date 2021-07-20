import java.util.Scanner;

public class workingQueue {
	public static void main(String[] args) {
		queueClass queue = new queueClass();
		Scanner scan = new Scanner(System.in);
		boolean checker = true;
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				System.out.println();
				System.out.print("What do you want to add: ");
				String item = scan.next();
				if(queue.fullChecker()) {
					checker = false;
				}
				queue.add(item);
				if(checker) {
					System.out.println();
					System.out.println(queue.toString());
				}
				checker = true;
			}
			else if(control.toLowerCase().equals("remove")) {
				queue.remove();
				System.out.println();
				System.out.println(queue.toString());
			}
			else if(control.toLowerCase().equals("quit")) {
				loop = false;
			}
			else {
				System.out.println();
				System.out.println("That is not a valid input");
				System.out.println();
			}
		}
		scan.close();
	}
}