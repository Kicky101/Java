
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
				// THIS THING
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
	public void remove(int x) {
		removeRecursion(x, headNode);
	}
	// walk through to find issue
	public void removeRecursion(int x, confusingNode newNode) {
		if(x > newNode.getData()) {
			if(newNode.getRightNode().getData() == x) {
				if(newNode.getRightNode().getRightNode() != null) {
					if(newNode.getRightNode().getLeftNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getRightNode().getRightNode();
						newNode.setRightNode(tempNode);
						return;
					}
					// The scary if statement goes here
				}
				else if(newNode.getRightNode().getLeftNode() != null) {
					if(newNode.getRightNode().getRightNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getRightNode().getLeftNode();
						newNode.setRightNode(tempNode);
						return;
					}
					// The scary if statement goes here
				}
				else {
					newNode.setRightNode(null);
					return;
				}
			}
		}
		if(x <= newNode.getData()) {
			if(newNode.getLeftNode().getData() == x) {
				if(newNode.getLeftNode().getRightNode() != null) {
					if(newNode.getLeftNode().getLeftNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getLeftNode().getRightNode();
						newNode.setLeftNode(tempNode);
						return;
					}
					// The scary if statement goes here
				}
				else if(newNode.getLeftNode().getLeftNode() != null) {
					if(newNode.getLeftNode().getRightNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getLeftNode().getLeftNode();
						newNode.setLeftNode(tempNode);
						return;
					}
					// The scary if statement goes here
				}
				else {
					newNode.setLeftNode(null);
					return;
				}
			}
		}
		if(x > newNode.getData()) {
			removeRecursion(x, newNode = newNode.getRightNode());
			// move down right
		}
		else if(x <= newNode.getData()) {
			removeRecursion(x, newNode = newNode.getLeftNode());
			// move down left
		}	
	}
	public String toString() {
		return recursiveToString(headNode);
	}
	public String recursiveToString(confusingNode newNode) {
		String temp = "";
		if(newNode.getRightNode() != null && newNode.getLeftNode() == null) {
			// only one node on the right
			temp = temp + "This node contains " + newNode.getData() + ", with a right node of " + newNode.getRightNode().getData() + "\n" + recursiveToString(newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			// only one node on the left
			temp = temp + "This node contains " + newNode.getData() + ", with a left node of " + newNode.getLeftNode().getData() + "\n" + recursiveToString(newNode.getLeftNode());
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			// one node on both right and left
			temp = temp + "This node contains " + newNode.getData() + ", with a left node of " + newNode.getLeftNode().getData() + ", and with a right node of " + newNode.getRightNode().getData() + "\n" + recursiveToString(newNode.getLeftNode());
			temp += recursiveToString(newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			// no nodes on both right and left
			temp = temp + "This node contains " + newNode.getData() + "\n";
			return temp;
		}
		return temp;
	}
}
