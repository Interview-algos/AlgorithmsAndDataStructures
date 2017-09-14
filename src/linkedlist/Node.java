package linkedlist;
public class Node {
	public int  data;
	public Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}

}