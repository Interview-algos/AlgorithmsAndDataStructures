package linkedlist;

public class sNode {
	public String data;
	sNode nextNode;
	
	public sNode(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public sNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(sNode nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}

}
