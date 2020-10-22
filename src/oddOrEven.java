import java.util.Scanner;

public class oddOrEven {
	public static void main(String[] args) {
		//too doo
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert your number: ");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		scan.close();
	}
}
