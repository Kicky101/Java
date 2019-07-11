import java.util.Scanner;

import java.util.Arrays;

import java.util.Random;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] bruh = new int[rand.nextInt(20)+1];
        for(int i = 0; i<bruh.length; i++) {
            bruh[i] = rand.nextInt(50);
        }
        System.out.println("");
        System.out.println("Unsorted");
        System.out.println("");
        for(int i = 0; i<bruh.length; i++) {
			System.out.println(bruh[i]);
        }
        System.out.println("");
        System.out.println("Sorted");
        System.out.println("");
        bruh = mergeSort(bruh);
        for(int i = 0; i<bruh.length; i++) {
			System.out.println(bruh[i]);
        }
        System.out.println("");
        while(true) {
            System.out.print("What number will you look for: ");
            int num = scan.nextInt();
            System.out.println(search(num, bruh));
            System.out.print("Do you want to exit: ");
            String exit = scan.next();
        if(exit.toLowerCase().equals("yes")) {
            break;
        }
    }
        
    }
    private static boolean search(int num, int[] bruh) {
            if(bruh.length == 1) {
                return (bruh[0] == num);
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
        if(bruh.length == 0) {
            return what;
        }
        int deletThis = bruh[0];
        for(int i = 1; i<bruh.length; i++){
            if(bruh[i]<deletThis) {
                deletThis = bruh[i];
                int bruhMoment = bruh[i];
                bruh[i] = bruh[0];
                bruh[0] = bruhMoment;
            }
        }
        what[0] = deletThis;



        int[] x = selectionSort(Arrays.copyOfRange(bruh, 1, bruh.length));
        for(int i = 1; i<what.length; i++) {
            what[i] = x[i-1];
        }
        return what;
    }
    private static int[] mergeSort(int[] bruh) {
        int[] what = new int[bruh.length];
        int[] breh = Arrays.copyOfRange(bruh,0,bruh.length/2);
        bruh = Arrays.copyOfRange(bruh,bruh.length/2,bruh.length);
        if(bruh.length>1) {
            bruh = mergeSort(bruh);
        }
        if(breh.length>1) {
            breh = mergeSort(breh);
        }
        int b = bruh.length+breh.length-1;
        int n=0;
        for(int i = 0; i<b;i++) {
            if(bruh[0]<breh[0]) {
                what[i] = bruh[0];
                bruh = Arrays.copyOfRange(bruh,1,bruh.length);
            }
            else if(bruh[0] >= breh[0]) {
                what[i] = breh[0];
                breh = Arrays.copyOfRange(breh,1,breh.length);
            }
            if(bruh.length==0 || breh.length==0) {
                n=i+1;
                break;
            }
        }
        if(bruh.length > 0) {
            for(int i = 0;i<bruh.length;i++) {
                what[n] = bruh[i];
            }
        }
        else {
            for(int i = 0;i<breh.length;i++) {
                what[n] = breh[i];
            }
        }
        return what;
    }
}