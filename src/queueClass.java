import java.util.Arrays;

public class queueClass<E> {
	private int size = 10;
	private E[] theQueue = (E[]) new Object[size];
	public int open = 1;
	public int remove = 0;
	public int first = 0;
	public int last = 0;
	public boolean firstCheck = true;
	public boolean firstCheck2 = false;
	
	public void add(E x) {
		//reset();
		if(!fullChecker()) {
			if(theQueue[0] == null && emptyChecker()) {
				theQueue[0] = x;
				first = 0;
				last = 0;
				firstCheck = false;
			}
			else {
				if(last == theQueue.length-1) {
					last = 0;
				}
				else {
					last++;
				}
				if(open == theQueue.length) {
					open = 0;
				}
				theQueue[open] = x;
				open++;
			}
		}
		else {
			firstCheck2 = true;
			firstCheck = true;
			System.out.println();
			System.out.println("You need to remove first");
			System.out.println();
		}
	}
	
	//0 0 0 0 0 0 0 0 0
	//1 2 3 4 5 0 0 0 0
	//0 0 0 4 5 0 0 0 0
	
	public void remove() {
		//reset();
		if(!emptyChecker()) {
			if(first == theQueue.length-1) {
				first = 0;
			}
			else {
				first++;
			}
			theQueue[remove] = null;
			remove++;
			if(remove == theQueue.length) {
				remove = 0;
			}
			if(theQueue[remove] == null) {
				remove = 0;
				open = 1;
				first = 0;
				last = 0;
			}
			if(emptyChecker()) {
				System.out.println();
				System.out.println("The queue is empty");
				System.out.println();
			}
		}
		else {
			System.out.println();
			System.out.println("The queue is empty");
			System.out.println();
		}
	}
	
	public boolean fullChecker() {
		boolean fullChecker = false;
		if((first == 0 && last >= theQueue.length-1) && theQueue[last] != null) {
			fullChecker = true;
		}
		else if((first == last-1 || last == first-1) && theQueue[last+1] != null) {
			fullChecker = true;
		}
		return fullChecker;
	}
	
	public boolean emptyChecker() {
		boolean emptyChecker = false;
		if((first == 0 && last == 0) && theQueue[0] == null) {
			emptyChecker = true;
		}
		return emptyChecker;
	}
	
	public int itemChecker() {
		int x = 0;
		/*
		for(int j = 0; j < theQueue.length-1; j++) {
			if(theQueue[j] != null) {
				x++;
			}
		}
		*/
		return x;
	}
	
	public void reset() {
		if(emptyChecker() && open == 0) {
			System.out.println("reset");
			open = 1;
			remove = 0;
			firstCheck = true;
			firstCheck2 = false;
			first = 0;
			last = 0;
		}
	}
	
	public String toString() {
		return Arrays.toString(theQueue) + "\n";
		/*
		String temp = "";
		boolean loop = true;
		int x = 0;
		int y = 1;
		while(loop) {
			if(theQueue[x] != null) {
				if(y != itemChecker()) {
					temp = temp + theQueue[x] + ", ";
				}
				else {
					temp = temp + theQueue[x] + "\n";
				}
				y++;
			}
			if(x == theQueue.length-1) {
				loop = false;
			}
			x++;
		}
		if(temp.equals("")) {
			temp = "The queue is empty \n";
		}
		return temp;
		*/
	}
}
