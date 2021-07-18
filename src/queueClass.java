public class queueClass {
	private int size = 10;
	private int[] theQueue = new int[size];
	public int number = 1;
	
	public void add() {
		if(!fullChecker()) {
			if(theQueue[0] == 0) {
				theQueue[0] = number;
				number++;
			}
			else {
				for(int i = 0; i < theQueue.length-1; i++) {
					if(theQueue[i] == 0) {
						theQueue[i] = number;
						i = theQueue.length-1;
					}
				}
				number++;
			}
		}
		else {
			System.out.println();
			System.out.println("You need to remove first");
			System.out.println();
		}
	}
	
	public void remove() {
		int counter = 0;
		theQueue[0] = 0;
		for(int i = 0; i < theQueue.length-1; i++) {
			if(theQueue[i+1] != 0) {
				theQueue[i] = theQueue[i+1];
				counter++;
			}
		}
		theQueue[counter] = 0;
	}
	
	public boolean fullChecker() {
		boolean fullChecker = true;
		for(int j = 0; j < theQueue.length-1; j++) {
			if(theQueue[j] == 0) {
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
			if(theQueue[0] != 0) {
				temp = temp + theQueue[x];
				temp = temp + "\n";
			}
			if(theQueue[x+1] == 0) {
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
