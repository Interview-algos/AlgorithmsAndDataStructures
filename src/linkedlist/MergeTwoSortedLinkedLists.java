package linkedlist;




public class MergeTwoSortedLinkedLists {

	public static void main(String[] args){
		
		LinkedList LL1 = new LinkedList();

		LL1.addAtStart(7);
		LL1.addAtStart(5);
		LL1.addAtStart(3);
		LL1.addAtStart(1);
		
		
		LinkedList LL2 = new LinkedList();
		
		LL2.addAtStart(8);
		LL2.addAtStart(6);
		LL2.addAtStart(4);
	
		Node result = MergeLists(LL1.getHead(), LL2.getHead());
		LL1.printList(result);
		
		
		System.out.println("======================================");
		
		//Node result = mergeLinkedList(LL1.getHead(), LL2.getHead());
		//LL1.printList(result);
		
			
		
	}

	
	
	//recursively
	public static Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    if (headA == null){
	        return headB;
	    }
	    if (headB == null){
	        return headA;
	    }
	    if (headA.data < headB.data){
	        headA.nextNode = MergeLists(headA.nextNode, headB);
	        return headA;
	    }
	    else {
	        headB.nextNode = MergeLists(headA, headB.nextNode);
	        return headB;
	    }
	}
	
	
	
	//without recursively
	private static Node mergeLinkedList(Node h1, Node h2) {
		Node newHead = null;
		Node temp;

		if (h1.data > h2.data) {
			temp = h1;
			h1 = h2;
			h2 = temp;
		}

		newHead = h1;
		h1 = h1.nextNode;
		temp = newHead;

		while (h1 != null && h2 != null) {
			if (h1.data > h2.data) {
				temp = h1;
				h1 = h2;
				h2 = temp;
			}

			temp.nextNode = h1;
			temp = h1;
			h1 = h1.nextNode;
		}

		if (h1 == null)
			temp.nextNode = h2;
		else
			temp.nextNode = h1;

		return newHead;
	}
}
