import java.util.Scanner;

public class forShapes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to make a square (s), a right triangle (rt), an equilateral triangle (t), an upside-down triangle (ut), a diamond (d), or quit (q): ");
			String shape = scan.next();
			if(shape.toLowerCase().equals("s")){
				System.out.println();
				System.out.print("What size do you want your square to be: ");
				int size = scan.nextInt();
				System.out.println();
				square(size);
				System.out.println();
			}
			else if(shape.toLowerCase().equals("rt")) {
				System.out.println();
				System.out.print("What size do you want your right triangle to be: ");
				int size = scan.nextInt();
				System.out.println();
				rightTriangle(size);
				System.out.println();
			}
			else if(shape.toLowerCase().equals("t")) {
				System.out.println();
				System.out.print("What size do you want your equilateral triangle to be: ");
				int size = scan.nextInt();
				System.out.println();
				triangle(size);
				System.out.println();
			}
			else if(shape.toLowerCase().equals("ut")) {
				System.out.println();
				System.out.print("What size do you want your upside-down triangle to be: ");
				int size = scan.nextInt();
				System.out.println();
				upsideTriangle(size);
				System.out.println();
			}
			else if(shape.toLowerCase().equals("d")) {
				System.out.println();
				System.out.print("What size do you want your diamond to be: ");
				int size = scan.nextInt();
				System.out.println();
				diamond(size);
				System.out.println();
			}
			else if(shape.toLowerCase().equals("q")) {
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
	
	private static void square(int size) {
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void rightTriangle(int size) {
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void triangle(int size) {
		for(int i = 0; i<size; i++) {
			for(int j = i; j<=size-2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void upsideTriangle(int size) {
		for(int i = size; i>0; i--) {
			for(int j = i; j<=size-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void diamond(int size) {
		for(int i = 0; i<size; i++) {
			for(int j = i; j<=size-2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = size-1; i>0; i--) {
			for(int j = i; j<=size-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<=i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}