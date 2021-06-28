
public class Node<E> {
	private E data = null;
	private Node<E> nextNode;
	public Node(E z) {
		data = z;
		nextNode = null;
	}
	public E getData() {
		return data;
	}
	public Node<E> getNextNode() {
		return nextNode;
	}
	public void setData(E x) {
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
