

package linkedlist;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList headA = new LinkedList();

		headA.addAtStart(7);
		headA.addAtStart(5);
		headA.addAtStart(3);
		headA.addAtStart(1);
		
		Node head = reverse(headA.getHead());
		headA.printList(head);
		
		
		
	}
	
	
	public static Node reverse(Node headA){
		
		Node currNode = headA ;
		Node prevNode = null ;
		Node nextNode = null ;
		
		while(currNode != null){
			nextNode = currNode.nextNode ;
			currNode.nextNode = prevNode ;
			prevNode = currNode  ;
			currNode =nextNode ;
			
		}
		
		return prevNode ;
		
	}

}
