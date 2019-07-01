import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.print("Enter your operation: ");
			String operation = scan.next();
			if(operation.equals("!") ) {
				System.out.print("Enter your number: ");
				int fac =  scan.nextInt();
				int cur = 1;
				for(int i=1; i<=fac; i++) {
					cur*=i;
				}
				System.out.println(cur);
			}
			else if(operation.equals("+")) {
				System.out.print("Enter your first number: ");
				double add1 = scan.nextDouble();
				System.out.print("Enter your second number: ");
				double add2 = scan.nextDouble();
				System.out.print(add1 + " + " + add2 + " = " + (add1+add2));
			}
			else if(operation.equals("-")) {
				System.out.print("Enter your first number: ");
				double sub1 = scan.nextDouble();
				System.out.print("Enter your second number: ");
				double sub2 = scan.nextDouble();
				System.out.print(sub1 + " - " + sub2 + " = " + (sub1-sub2));
			}
			else if(operation.equals("*")) {
				System.out.print("Enter your first number: ");
				double mul1 = scan.nextDouble();
				System.out.print("Enter your second number: ");
				double mul2 = scan.nextDouble();
				System.out.print(mul1 + " * " + mul2 + " = " + (mul1*mul2));
			}
			else if(operation.equals("/")) {
				System.out.print("Enter your first number: ");
				double div1 = scan.nextDouble();
				System.out.print("Enter your second number: ");
				double div2 = scan.nextDouble();
				System.out.print(div1 + " / " + div2 + " = " + (div1/div2));
			}
			else if(operation.toLowerCase().equals("quit")) {
				loop = false;
			}
			else {
				System.out.println("That function does not exist");
				System.out.println("The functions are addition(+), subtraction(-), multiplication(*), division(/) and factorial(!)");
			}
		}
		scan.close();
	}
}