
public class confusingNode {
	private int data = 0;
	private confusingNode rightNode;
	private confusingNode leftNode;
	public confusingNode(int z) {
		data = z;
		rightNode = null;
		leftNode = null;
	}
	public int getData() {
		return data;
	}
	public confusingNode getRightNode() {
		return rightNode;
	}
	public confusingNode getLeftNode() {
		return leftNode;
	}
	public void setData(int x) {
		data = x;
	}
	public void setRightNode(confusingNode y) {
		rightNode = y;
	}
	public void setLeftNode(confusingNode y) {
		leftNode = y;
	}
	public String toString() {
		String temp = "";
		temp = "This node contains " + data;
		return temp;
	}
}
