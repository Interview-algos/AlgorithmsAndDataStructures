package ch04;

public class Node<T> {
	public T data;
	public Node<T> nextNode;
	
	public Node(T data) {
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
		return "Data: " + this.data;
	}

}
