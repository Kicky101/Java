 import java.util.Scanner;
 
 public class recursion { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
        System.out.print("Do you want to break the code(1) count to 0(2) do some factorials(3) add stuff(4) multiply stuff(5) use exponents(6) or mess with the Fibonacci Sequence(7): ");
        int first = scan.nextInt();
        if(first == 1) {
            printX();
        }
        if(first == 2) {
            System.out.print("What do you want your number to be: ");
            int inputNum = scan.nextInt();
            int num = inputNum;
            countDown(num);
        }
        if(first == 3) {
            System.out.print("What number would you like to factorial: ");
            int inputNum1 = scan.nextInt();
            System.out.println(factorial(inputNum1));
        }
        if(first == 4) {
            System.out.print("What will your first number be: ");
            int firstNum = scan.nextInt();
            System.out.print("What will your second number be: ");
            int secondNum = scan.nextInt();
            System.out.println(add(firstNum, secondNum));
        }
        if(first == 5) {
            System.out.print("What will your first number be: ");
            int firstNum = scan.nextInt();
            System.out.print("What will your second number be: ");
            int secondNum = scan.nextInt();
            System.out.println(multiply(firstNum, secondNum));
        }
        if(first == 6) {
            System.out.print("What will your first number be: ");
            int firstNum = scan.nextInt();
            System.out.print("What will your second number be: ");
            int secondNum = scan.nextInt();
            System.out.println(exponent(firstNum, secondNum));
        }
        if(first == 7) {
            System.out.print("What do you want to go up to: ");
            int firstNum = scan.nextInt();
           fibb(firstNum);
        }
    }
    }
    private static void printX() {
        System.out.println("X");
        printX();
    }
    private static void countDown(int num) {
        if(num > -1) {
            System.out.println(num + " ");
            if(num == 0) {
                return;
            }
            countDown(num-1);
        } 
        if(num < 1) {
            System.out.println(num + " ");
            if(num == 0) {
                return;
            }
            countDown(num+1);
        } 
    }
    private static int factorial(int inputNum1) {
        if(inputNum1 == 1) {
            return inputNum1; 
        }
        return inputNum1*factorial(inputNum1-1);
    }
    private static int add(int firstNum, int secondNum) {
        if(secondNum== 0){
            return firstNum;
        } 
        return 1+add(firstNum-1, secondNum);
    }
    private static int multiply(int firstNum, int secondNum) {
        if(secondNum == 1){
            return firstNum;
        }
        return firstNum+multiply(firstNum, secondNum-1);
    }
    private static int exponent(int firstNum, int secondNum) {
        if(secondNum == 1){

    
            return firstNum;
        }
        return firstNum*exponent(firstNum, secondNum-1);
    }
    private static int fib(int firstNum) {
        if(firstNum == 1) {
            return 1;
        }
        if(firstNum == 0) {
            return 0;
        }
        return fib(firstNum-1)+fib(firstNum-2);
    }
    private static void fibb(int firstNum) {
        for(int i = 0; i<firstNum; i++) {
            System.out.println(fib(i));
        }
    }
 }
 