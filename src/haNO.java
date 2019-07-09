import java.util.Scanner;

public class haNO {
    static int loop=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("How large is your Hanoi Tower (1 - 10): ");
            int size = scan.nextInt();
            if(size > 10 || size < 1) {
                System.out.println("That size is not in the range");
                continue;
            }
            else if(size <= 10 || size >= 1) {
                int from = 1;
                int to = 3;
                move(size, from, to);
                break;
            }
        } 
        System.out.println("Your tower is finished!");  
        scan.close(); 
    }
    private static void move(int size, int from, int to) {
        if(size == 1) {
            System.out.println("Move the " + size + " piece from " + from + " to " + to);
            loop++;
            if(loop == 10) {
                loop = 0;
                try{
                    System.out.println("");
                    System.out.print("Press Enter to continue");
                    System.in.read();
                }
                catch(Exception e){	
                    e.printStackTrace();
                }
                System.out.println("");
                System.out.println("");
            }
            return;
        }
        else {
            int b = 3-((from+to)%3);
            move(size-1, from, b);
            System.out.println("Move the " + size + " piece from " + from + " to " + to);
            loop++;
            if(loop == 10) {
                loop = 0;
                try{
                    System.out.println("");
                    System.out.print("Press Enter to continue");
                    System.in.read();
                }
                catch(Exception e){	
                    e.printStackTrace();
                }
                System.out.println("");
                System.out.println("");
            }
            move(size-1, b, to);
        }
    }
}
