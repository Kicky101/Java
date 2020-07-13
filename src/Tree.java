
public class Tree {
	private confusingNode headNode;
	public Tree Tree;
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
		if(newNode.getRightNode() == null) {
			if(x > newNode.getData()) {
				newNode = new confusingNode(x);
				newNode.setRightNode(newNode);
				// add to right
			}
		}
		else if(newNode.getLeftNode() == null) {
			if(x <= newNode.getData()) {
				newNode = new confusingNode(x);
				newNode.setLeftNode(newNode);
				// add to left
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
			recursiveToString(newNode = newNode.getLeftNode());
			temp = "This node contains " + newNode.getData();
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			// only one node on the left
			recursiveToString(newNode = newNode.getRightNode());
			temp = "This node contains " + newNode.getData();
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			// one node on both right and left
			recursiveToString(newNode = newNode.getRightNode());
			temp = "This node contains " + newNode.getData();
			recursiveToString(newNode = newNode.getLeftNode());
			temp = "This node contains " + newNode.getData();
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			// no nodes on both right and left
			return temp;
		}
		return temp;
	}
}
