import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to play Blackjack: ");
			String start = scan.next();
			if(start.toLowerCase().equals("yes")) {
				boolean loopOne = true;
				while(loopOne) {
					System.out.print("Do you want to hit or stand: ");
					String hitOrStand = scan.next();
					if(hitOrStand.toLowerCase().equals("hit")) {
						System.out.println("lol");
					}
					else if(hitOrStand.toLowerCase().equals("stand")) {
						System.out.println("pog");
					}
					else if(hitOrStand.toLowerCase().equals("quit")) {
						loopOne = false;
					}
					else {
						loopOne = true;
					}
				}
			}
			else if(start.toLowerCase().equals("no")) {
				loop = false;
			}
			else {
				loop = true;
			}
		}
		scan.close();
	}
}
