import java.util.Scanner;

import java.util.Arrays;

import java.util.Random;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] bruh = new int[11];
        for(int i = 1; i<=10; i++) {
            bruh[i] = rand.nextInt(50);
        }
        bruh = selectionSort(bruh);
        for(int i = 0; i<bruh.length; i++) {
			System.out.println(bruh[i]);
        }
        /*
        for(int i=0;i<bruh[bruh.length-1];i++) {
            System.out.print("What number will you look for: ");
        int num = i;
        System.out.println(search(num, bruh));
        System.out.print("Do you want to exit: ");
        String exit = scan.next();
        if(exit.toLowerCase().equals("yes")) {
            break;
        }
        */
        
    }
    private static boolean search(int num, int[] bruh) {
            if(bruh.length == 1) {
                return bruh.length == num;
            }
            else if(num == bruh[bruh.length/2]) {
                return true;
            }
            else if(num < bruh[bruh.length/2]) {
                return search(num, Arrays.copyOfRange(bruh,0,bruh.length/2));
            }
            else if(num > bruh[bruh.length/2]) {
                return search(num, Arrays.copyOfRange(bruh,bruh.length/2,bruh.length));
            }
            else {
                return false;
            }
    }
    private static int[] selectionSort(int[] bruh) {
        int[] what = new int[bruh.length];
        int deletThis = bruh[0];
        for(int i = 1; i<bruh.length; i++){
            if(bruh[i]<deletThis) {
                deletThis = bruh[i];
            }
        }
        what[0] = deletThis;
        int[] x = selectionSort(Arrays.copyOfRange(bruh, 1, bruh.length));
        for(int i = 1; i<what.length; i++) {
            what[i] = x[i-1];
        }
        return what;
    }
}