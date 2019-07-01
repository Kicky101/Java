import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What will your square be made of?");
		String y = scan.next();
		System.out.println("What will the width of your rectangle be?");
		int z = scan.nextInt();
		System.out.println("What will the length of your rectangle be?");
		int r = scan.nextInt();
		scan.close();
		for(int i = 0; i<z; i++) {
			for(int x = 0; x<r; x++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
