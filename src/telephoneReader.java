import java.util.Scanner;

public class telephoneReader {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a telephone number: ");
		String number = scan.next();
		scan.close();
		String first = number.substring(0, 3);
		String second = number.substring(3,6);
		String third = number.substring(6,10);
		String real = "(" + first + ") " + second + "-" + third;
		System.out.println(real);
 	}
}
