
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
			if(x > newNode.getRightNode().getData()) {
				// add	
			}
		}
		else if(newNode.getLeftNode() == null) {
			if(x <= newNode.getLeftNode().getData()) {
				// add
			}
		}
	}
}
