
public class linkedList {
	private Node headNode;
	private int counter = 0;
	public linkedList() {
		
	}
	public void add(int x) {
		if(headNode == null) {
			headNode = new Node(x);
		}
		else {
			if(headNode.getNextNode() == null) {
				Node tempNode = new Node(x);
				headNode.setNextNode(tempNode);
			}
			else {
				Node newNode = new Node(x);
				newNode = headNode;
				boolean loop = true;
				while(loop) {
					newNode = newNode.getNextNode();
					if(newNode.getNextNode() == null) {
						loop = false;
					}
				}
				Node tempNode = new Node(x);
				newNode.setNextNode(tempNode);
			}
		}
		counter++;
	}
	public void remove() {
		if(headNode.getNextNode() == null) {
			headNode = null;
		}
		else {
			Node newNode;
			newNode = headNode;
			boolean loop = true;
			while(loop) {
				if(newNode.getNextNode().getNextNode() == null) {
					loop = false;
				}
				else {
					newNode = newNode.getNextNode();
				}
			}
			newNode.setNextNode(null);
		}
		counter--;
	}
	public void specificAdd(int x, int y) {
		Node newNode = new Node(x);
		newNode = headNode;
		if(y > counter) {
			newNode = null;
		}
		else if(headNode == null) {
			headNode = new Node(x);
		}
		else {
			Node tempoNode = new Node(x);
			if(y == 0) {
				tempoNode = headNode;
				headNode = new Node(x);
				headNode.setNextNode(tempoNode);
			}
			else {
				tempoNode = newNode.getNextNode();
				//tempo = 1
				tempoNode.setNextNode(tempoNode);
				//5 = 1
				//This doesnt work because the node this is stored in is replaced
				for(int i = 0; i < y-1; i++) {
					newNode = newNode.getNextNode();
				}
				//new = 0
				Node tempNode = new Node(x);
				//temp = 7
				newNode.setNextNode(tempNode);
				//1 = 7
			}
		}
		counter++;
	}
	public String toString() {
		String temp = "";
		boolean loop = true;
		Node newNode;
		newNode = headNode;
		while(loop) {
			temp = temp + newNode;
			temp = temp + "\n";
			temp = temp + "\n";
			if(newNode.getNextNode() == null) {
				loop = false;
			}
			newNode = newNode.getNextNode();
		}	
		return temp;
	}
}
