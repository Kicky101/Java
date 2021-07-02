import java.util.Random;

public class endlessQueue {
	public static void main(String[] args) {
		int[] theQueue = new int[100];
		Random rand = new Random();
		int queueNumber = 1;
		int queuePlace = 0;
		int queueRemove = 0;
		boolean loop = true;
		while(loop) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int queueRandom = rand.nextInt(2);
			if(queueRandom == 0) {
				theQueue[queuePlace] = queueNumber;
				queueNumber++;
				queuePlace++;
				for(int i = 0; i < queueNumber; i++) {
					if(theQueue[i] != 0) {
						System.out.println(theQueue[i]);
					}
				}
				System.out.println("");
			}
			if(queueRandom == 1) {
				theQueue[queueRemove] = 0;
				queueRemove++;
				for(int i = 0; i < queueNumber; i++) {
					if(theQueue[i] != 0) {
						System.out.println(theQueue[i]);
					}
				}
				System.out.println("");
			}
			if(theQueue[99] != 0) {
				loop = false;
			}
		}
	}
}
