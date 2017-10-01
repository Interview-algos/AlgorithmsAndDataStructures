package srihari;
public class Node {
	public String data;
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public Node link;
	
	public Node() {
		data = "";
		link = null;
	}
	
	public Node(String val , Node link) {
		this.data = val;
		this.link = link;
	}
	
	
}
