
public class linkedList {
	private Node headNode;
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
	}
	public void specificAdd(int x) {
		
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
