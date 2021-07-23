import java.util.Arrays;

public class heapClass {
	private int size = 10;
	private int[] theHeap = new int[size];
	private int open = 0;
	public void add(int x) {
		if(theHeap[0] == 0) {
			theHeap[0] = x;
			open++;
		}
		else {
			theHeap[open] = x;
			open++;
		}
	}
	public void remove() {
		
	}
	public void siftUp(int x) {
		int y = 0;
		int placeholder = 0;
		if(x > theHeap[y]) {
			placeholder = theHeap[y];
			theHeap[y] = x;
			x = placeholder;
		}
	}
	public String toString() {
		return Arrays.toString(theHeap) + "\n";
	}
}
