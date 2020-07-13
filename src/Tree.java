
public class Tree {
	private confusingNode headNode;
	public Tree() {
		
	}
	public void add(int x) {
		if(headNode == null) {
			headNode = new confusingNode(x);
		}
		else {
			addRecursion(x, headNode);
		}
	}
	public void addRecursion(int x, confusingNode newNode) {
		if(x > newNode.getData()) {
			if(newNode.getRightNode() == null) {
				confusingNode tempNode = new confusingNode(x);
				newNode.setRightNode(tempNode);
				// add to right
			}
			else {
				addRecursion(x, newNode = newNode.getRightNode());
			}
		}
		else if(x <= newNode.getData()) {
			if(newNode.getLeftNode() == null) {
				confusingNode tempNode = new confusingNode(x);
				//THIS THING
				newNode.setLeftNode(tempNode);
				// add to left
			}
			else {
				addRecursion(x, newNode = newNode.getLeftNode());
			}
		}
		else {
			if(x > newNode.getData()) {
				addRecursion(x, newNode = newNode.getRightNode());
				// move down right
			}
			else if(x <= newNode.getData()) {
				addRecursion(x, newNode = newNode.getLeftNode());
				// move down left
			}
		}
	}
	public String toString() {
		return recursiveToString(headNode);
	}
	public String recursiveToString(confusingNode newNode) {
		String temp = "";
		if(newNode.getRightNode() != null && newNode.getLeftNode() == null) {
			// only one node on the right
			temp = temp + "This node contains " + newNode.getData() + recursiveToString(newNode = newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			// only one node on the left
			temp = temp + "This node contains " + newNode.getData() + recursiveToString(newNode = newNode.getLeftNode());
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			// one node on both right and left
			temp = temp + "This node contains " + newNode.getData() + recursiveToString(newNode = newNode.getLeftNode());
			temp = temp + "This node contains " + newNode.getData() + recursiveToString(newNode = newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			// no nodes on both right and left
			temp = temp + "This node contains " + newNode.getData();
			return temp;
		}
		return temp;
	}
}
