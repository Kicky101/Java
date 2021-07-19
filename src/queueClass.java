public class queueClass<E> {
	private int size = 10;
	private E[] theQueue = (E[]) new Object[size];
	public int open = 0;
	public boolean firstCheck = true;
	public int first = 0;
	
	public void add(E x) {
		if(!fullChecker()) {
			if(theQueue[0] == null) {
				theQueue[0] = x;
				if(firstCheck) {
					first = 0;
					firstCheck = false;
				}
			}
			else {
				if(firstCheck) {
					first = 0;
				}
				theQueue[open] = x;
				
			}
		}
		else {
			System.out.println();
			System.out.println("You need to remove first");
			System.out.println();
		}
	}
	
	//1 2 3 4 5 6 7 8 9
	//0 0 0 0 0 0 7 8 9
	//10 11 12 0 0 0 7 8 9
	//10 11 12 0 0 0 0 0 0
	//0 0 12 0 0 0 0 0 0
	
	//1 2 3 4 5 6 7 8 9
	//0 0 0 0 0 0 0 0 9
	//10 11 0 0 0 0 0 0 9
	//0 11 0 0 0 0 0 0 0
	public void remove() {
		/*
		theQueue[smallest] = null;
		if(smallest + 1 != 0) {
			smallest++;
		}
		else {
			smallest = 0;
		}
		*/
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
	
	public String toString() {
		String temp = "";
		boolean loop = true;
		int x = 0;
		while(loop) {
			if(theQueue[0] != null) {
				temp = temp + theQueue[x];
				temp = temp + "\n";
			}
			if(theQueue[x+1] == null) {
				loop = false;
			}
			x++;
		}
		if(temp.equals("")) {
			temp = "The queue is empty \n";
		}
		return temp;
	}
}
