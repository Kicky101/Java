import java.util.Scanner;

public class shoppingList {
	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<nums.length; i++) {
			System.out.print("Enter a number: ");
			int input = scan.nextInt();
			nums[i] = input;
		}
		scan.close();
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
