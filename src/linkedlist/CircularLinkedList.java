package linkedlist;

public class CircularLinkedList {

	private Node head;

	public Node getHead() {
		return this.head;
	}

	public void addAtStart(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public Node deleteAtStart() {
		Node toDel = this.head;
		this.head = this.head.getNextNode();
		return toDel;
	}

	public Node find(int data) {
		Node curr = this.head;
		while (curr != null) {
			if (curr.getClass().equals(data)) {
				return curr;
			}
			curr = curr.getNextNode();
		}
		return null;
	}

	public int length() {
		if (head == null)
			return 0;
		int length = 0;
		Node curr = this.head;
		while (curr != null) {
			length += 1;
			curr = curr.getNextNode();
		}
		return length;
	}

	public boolean isEmpty() {
		return this.head == null;
	}
	
	
	public void printList(Node head) {
		  Node temp = head;
		  while (temp != null) {
		   System.out.format("%d ", temp.data);
		   temp = temp.nextNode;
		  }
		  System.out.println();
		 }
	
	public Node makeCircularLinkedList(Node headA){
		
		Node currNode = headA ;
		while(currNode!=null){
			
			currNode = currNode.nextNode ;
			
		}
		
		currNode.nextNode = headA ;
		return headA ;
	}

}
