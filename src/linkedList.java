
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
			if(y == 0) {
				headNode = new Node(x);
			}
			for(int i = 0; i < y-1; i++) {
				newNode = newNode.getNextNode();
			}
			Node tempNode = new Node(x);
			newNode.setNextNode(tempNode);
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
