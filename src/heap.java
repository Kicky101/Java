import java.util.Scanner;

public class heap {
	public static void main(String[] args) {
		heapClass heap = new heapClass();
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to add, remove, or quit: ");
			String control = scan.next();
			if(control.toLowerCase().equals("add")) {
				System.out.println();
				System.out.print("What non-zero integer do you want to add: ");
				String item = scan.next();
				if(item.matches(".*\\d.*")) {
					int number = Integer.parseInt(item);
					if(number != 0) {
						heap.add(number);
						System.out.println();
						System.out.println(heap.toString());
					}
					else {
						System.out.println();
						System.out.println("That is not a valid input");
						System.out.println();
					}
				}
				else {
					System.out.println();
					System.out.println("That is not a valid input");
					System.out.println();
				}
			}
			else if(control.toLowerCase().equals("remove")) {
				
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