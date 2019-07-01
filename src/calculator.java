import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your operation: ");
		String operation = scan.next();
		if(operation.equals("!") ) {
			System.out.print("Enter your number: ");
			int fac =  scan.nextInt();
		}
		else if(operation.equals("+")) {
			System.out.print("Enter your first number: ");
			int add1 = scan.nextInt();
			System.out.print("Enter your second number: ");
			int add2 = scan.nextInt();
			System.out.print(add1 + " + " + add2 + " = " + (add1+add2));
		}
		else if(operation.equals("-")) {
			System.out.print("Enter your first number: ");
			int sub1 = scan.nextInt();
			System.out.print("Enter your second number: ");
			int sub2 = scan.nextInt();
			System.out.print(sub1 + " - " + sub2 + " = " + (sub1-sub2));
		}
		else if(operation.equals("*")) {
			System.out.print("Enter your first number: ");
			int mul1 = scan.nextInt();
			System.out.print("Enter your second number: ");
			int mul2 = scan.nextInt();
			System.out.print(mul1 + " * " + mul2 + " = " + (mul1*mul2));
		}
		else if(operation.equals("/")) {
			System.out.print("Enter your first number: ");
			int div1 = scan.nextInt();
			System.out.print("Enter your second number: ");
			int div2 = scan.nextInt();
			System.out.print(div1 + " / " + div2 + " = " + (div1/div2));
		}
	}
}
