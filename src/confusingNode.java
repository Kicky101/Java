
public class confusingNode {
	private int data = 0;
	private Node rightNode;
	private Node leftNode;
	public confusingNode(int z) {
		data = z;
		rightNode = null;
		leftNode = null;
	}
	public int getData() {
		return data;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public Node getLeftNode() {
		return leftNode;
	}
	public void setData(int x) {
		data = x;
	}
	public void setRightNode(Node y) {
		rightNode = y;
	}
	public void setLeftNode(Node y) {
		leftNode = y;
	}
	public String toString() {
		String temp = "";
		temp = "This node contains " + data;
		return temp;
	}
}
