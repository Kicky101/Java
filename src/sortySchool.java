import java.util.ArrayList;

public class sortySchool {
	public static int[] selection(int[] nums) {
		int placeholder;
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				if(nums[j] < nums[i]) {
					placeholder = nums[i];
					nums[i] = nums[j];
					nums[j] = placeholder;
				}
			}
		}
		return nums;
	}
	public static int[] insertion(int[] nums) {
		int placeholder;
		int j;
		for(int i = 1; i < nums.length; i++) {
			placeholder = nums[i];
			j = i-1;
			while(j >= 0 && nums[j] > placeholder) {
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = placeholder;
		}
		return nums;
	}
	public static int sequential(String[] nums, String s) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	public static int binary(String[] nums, String s) {
		int min = 0;
		int max = nums.length-1;
		while(min <= max) {
			if(nums[(min+max)/2].compareTo(s) < 0) {
				min = (min+max)/2 + 1;
			}
			else if(nums[(min+max)/2].compareTo(s) > 0) {
				max = (min+max)/2 - 1;
			}
			else {
				return (min+max)/2;
			}
			
		}
		return -1;
	}
	public static ArrayList<Integer> listSelection(ArrayList<Integer> nums) {
		int placeholder;
		for(int i = 0; i < nums.size(); i++) {
			for(int j = i; j < nums.size(); j++) {
				if(nums.get(j) < nums.get(j)) {
					placeholder = nums.get(j);
					nums.set(i, nums.get(j));
					nums.set(j, placeholder);
				}
			}
		}
		return nums;
	}
	public static ArrayList<Integer> listInsertion(ArrayList<Integer> nums) {
		int placeholder;
		int j;
		for(int i = 1; i < nums.size(); i++) {
			placeholder = nums.get(i);
			j = i-1;
			while(j >= 0 && nums.get(i) > placeholder) {
				nums.set(j+1, nums.get(j));
				j--;
			}
			nums.set(j+1, placeholder);
		}
		return nums;
	}
	public static int listSequential(ArrayList<String> nums, String s) {
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i).equals(s)) {
				return i;
			}
		}
		return -1;
	}
	public static int listBinary(ArrayList<String> nums, String s) {
		int min = 0;
		int max = nums.size()-1;
		while(min <= max) {
			if(nums.get((min+max)/2).compareTo(s) < 0) {
				min = (min+max)/2 + 1;
			}
			else if(nums.get((min+max)/2).compareTo(s) > 0) {
				max = (min+max)/2 - 1;
			}
			else {
				return (min+max)/2;
			}
			
		}
		return -1;
	}
}