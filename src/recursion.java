 import java.util.Scanner;
 
 public class recursion { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to break the code(1) count to 0(2) or do some factorials(3): ");
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
        if(inputNum1-1 == 0) {
            return factorial(inputNum1); 
        }
        return factorial(inputNum1*factorial(inputNum1-1));
    }
 }