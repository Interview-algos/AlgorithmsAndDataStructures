package chapter4;


public class Node<T> {
	public T data;
	private Node<T> nextNode;
	
	public Node(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	
}
