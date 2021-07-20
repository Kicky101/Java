import java.util.Arrays;

public class queueClass<E> {
	private int size = 10;
	private E[] theQueue = (E[]) new Object[size];
	public int open = 1;
	public int remove = 0;
	public boolean firstCheck = true;
	public boolean firstCheck2 = false;
	
	public void add(E x) {
		reset();
		if(!fullChecker()) {
			if(theQueue[0] == null) {
				if(firstCheck) {
					theQueue[0] = x;
					firstCheck = false;
				}
			}
			else {
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
		reset();
		if(!emptyChecker()) {
			if(remove == 9) {
				remove = 0;
			}
			if(firstCheck2) {
				open = remove;
			}
			theQueue[remove] = null;
			remove++;
		}
	}
	
	public boolean fullChecker() {
		boolean fullChecker = true;
		for(int j = 0; j < theQueue.length-1; j++) {
			if(theQueue[j] == null) {
				fullChecker = false;
			}
		}
		return fullChecker;
	}
	
	public boolean emptyChecker() {
		boolean emptyChecker = true;
		for(int j = 0; j < theQueue.length-1; j++) {
			if(theQueue[j] != null) {
				emptyChecker = false;
			}
		}
		return emptyChecker;
	}
	
	public int itemChecker() {
		int x = 0;
		for(int j = 0; j < theQueue.length-1; j++) {
			if(theQueue[j] != null) {
				x++;
			}
		}
		return x;
	}
	
	public void reset() {
		if(emptyChecker()) {
			System.out.println("reset");
			open = 1;
			remove = 0;
			firstCheck = true;
			firstCheck2 = false;
		}
	}
	
	public String toString() {
		return Arrays.toString(theQueue);
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
