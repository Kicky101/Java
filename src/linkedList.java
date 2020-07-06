
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
				newNode = headNode.getNextNode();
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
	public String toString() {
		String temp = "";
		temp = "";
		return temp;
	}
}
