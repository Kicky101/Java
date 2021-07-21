public class heapClass {
	private int size = 10;
	private int[] theHeap = new int[size];
	private int last = 0;
	public void add(int x) {
		if(theHeap[0] == 0) {
			theHeap[0] = x;
			last++;
		}
		else {
			theHeap[last] = x;
			last++;
		}
	}
	public void remove() {
		
	}
	public void sift() {
		
	}
}
