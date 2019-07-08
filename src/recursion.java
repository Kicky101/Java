 import java.util.Scanner;
 
 public class recursion { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to break the code(1) count to 0(2) do some factorials(3) or add stuff(4): ");
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
        if(firstNum-1+0 == secondNum){
            return firstNum;
        } 
        return 1+add(firstNum, secondNum);
    }
 }