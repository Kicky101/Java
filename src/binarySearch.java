import java.util.Scanner;

import java.util.Arrays;

import java.util.Random;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] bruh = new int[rand.nextInt(20)+1];
        int ugh = bruh.length;
        int[] what = new int[bruh.length];
        for(int i = 0; i<bruh.length; i++) {
            bruh[i] = rand.nextInt(40);
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
        if(bruh.length==1){
            return bruh;
        }
        int[] what = new int[bruh.length];
        int[] breh = Arrays.copyOfRange(bruh,0,bruh.length/2);
        bruh = Arrays.copyOfRange(bruh,bruh.length/2,bruh.length);
        printArray(breh);
        printArray(bruh);
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
                n++;
                if(bruh.length == 0){
                    break;
                }
            }
        }
        else {
            for(int i = 0;i<breh.length;i++) {
                what[n] = breh[i];
                n++;
                if(breh.length == 0){
                    break;
                }
            }
        }
        System.out.println("what: ");printArray(what);
        return what;
    }

    public static void printArray(int[] x){
        for(int i = 0; i<x.length; i++) {
			System.out.println(x[i]);
        }
        System.out.println();
    }
    //Needs to be redone with one parameter -- recursion concept
    private static int[] quickSort(int[] bruh, int ugh, int[] what, int[] breh) {
        if(bruh.length==1) {
            return bruh;
        }
        int b = 0;
        int bee = 0;
        int be = 1;
        int beee = 0;
        int bei = 1;
        boolean letterB = true;
        while(letterB) {
            b = bruh[bruh.length - be];
            bruh[bruh.length - be] =  bruh[bruh.length - beee];
            for(int i = 0; i<bruh.length; i++) {
                if(bruh[bruh.length - be] > bruh[i]) {
                    bee = bruh[i];
                    bruh[i] = b;
                    bruh[bruh.length - beee] = bee;
                    break;
                }
            }
            for(int j = 0; j< bruh.length-bruh.length-beee; j++) {
                if(bruh[bruh.length - beee] > bruh[bruh.length-beee-bei]) {
                    bei++;
                    if(j == bruh.length-bruh.length-beee){
                        if(bruh.length == ugh){
                            what = bruh;
                        }
                        bruh = Arrays.copyOfRange(bruh, 0, bruh.length-beee-1);
                        if(bruh.length == ugh){
                            breh = what;
                        }
                        what = Arrays.copyOfRange(what, what.length-beee,what.length-beee);
                        breh = Arrays.copyOfRange(breh, breh.length-beee+1, breh.length);
                        
                        quickSort(bruh, ugh, what, breh);
                    }
                }
                else{
                    break;
                }
            }
            be++;
            beee++;
            if(bruh.length==0){
                break;
            }
        }
        return what;
    }  
}
