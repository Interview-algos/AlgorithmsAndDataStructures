package linkedlist;



public class StringLinkedList {

	private sNode head;

	public sNode getHead() {
		return this.head;
	}

	public void addAtStart(String data) {
		sNode newNode = new sNode(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public sNode deleteAtStart() {
		sNode toDel = this.head;
		this.head = this.head.getNextNode();
		return toDel;
	}

	public sNode find(int data) {
		sNode curr = this.head;
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
		sNode curr = this.head;
		while (curr != null) {
			length += 1;
			curr = curr.getNextNode();
		}
		return length;
	}

	public boolean isEmpty() {
		return this.head == null;
	}
	
	
	public void printList(sNode head) {
		  sNode temp = head;
		  while (temp != null) {
		   System.out.format("%d ", temp.data);
		   temp = temp.nextNode;
		  }
		  System.out.println();
		 }
	
	
	public sNode makeCircularLinkedList(sNode headA){
		
		sNode currNode = headA ;
		while(currNode.nextNode!=null){
			
			currNode = currNode.nextNode ;
			
		}
		
		currNode.nextNode = headA ;
		return headA ;
	}
	
	
public sNode makeLoop(sNode headA){
		
		sNode currNode = headA ;
		sNode secondNode = headA.nextNode ;
		while(currNode.nextNode!=null){
			
			currNode = currNode.nextNode ;
			
		}
		
		currNode.nextNode = secondNode ;
		return headA ;
	}

}
