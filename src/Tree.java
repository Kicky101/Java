
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
		confusingNode newNode = new confusingNode(0);
		String temp = "";
		if(newNode.getRightNode() != null && newNode.getLeftNode() == null) {
			// only one node on the right
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			// only one node on the left
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			// one node on both right and left
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			// no nodes on both right and left
		}
		return temp;
	}
}
