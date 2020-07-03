
public class Node {
	private int data = 0;
	private Node nextNode;
	public Node(int z) {
		data = z;
		nextNode = null;
	}
	public int getData() {
		return data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setData(int x) {
		data = x;
	}
	public void setNextNode(Node y) {
		nextNode = y;
	}
	public String toString() {
		String temp = "";
		temp = "This node contains " + data;
		return temp;
	}
}
