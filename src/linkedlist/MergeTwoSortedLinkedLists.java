package linkedlist;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {

		LLinkedList LL1 = new LLinkedList();

		LL1.addAtStart(7);
		LL1.addAtStart(5);
		LL1.addAtStart(3);
		LL1.addAtStart(1);

		LLinkedList LL2 = new LLinkedList();

		LL2.addAtStart(8);
		LL2.addAtStart(6);
		LL2.addAtStart(4);

		Node result = MergeLists(LL1.getHead(), LL2.getHead());
		LL1.printList(result);

		System.out.println("======================================");

		Node res2 = mergeLinkedList(LL1.getHead(), LL2.getHead());
		LL1.printList(res2);

	}
	
	

	/** 
	 * recursively
	 * @param headA
	 * @param headB
	 * @return
	 */
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
	
	
	
	
	
	
	

	/** NOT Working
	 *  without recursively
	 * @param node1
	 * @param node2
	 * @return
	 */
	private static Node mergeLinkedList(Node node1, Node node2) {

	
		
		   if(node1 == null)
		      return node2;
		   else if(node2 == null)
		      return node1;

		   Node head;
		   if(node1.data < node2.data)
		   {
		      head = node1;
		      node1 = node1.nextNode;
		   }
		   else
		   {
		      head = node2;
		      node2 = node2.nextNode;
		   }

		   Node current = head;
		   while((node1 != null) ||( node2 != null))
		   {
		      if(node1 == null) {
		         current.nextNode = node2;
		         return head;
		      }
		      else if (node2 == null) {
		         current.nextNode = node1;
		         return head;
		      }

		      if(node1.data < node2.data)
		      {
		          current.nextNode = node1;
		          current = current.nextNode;

		          node1 = node1.nextNode;
		      }
		      else
		      {
		          current.nextNode = node2;
		          current = current.nextNode;

		          node2 = node2.nextNode;
		      }
		   }
		   current.nextNode = null ; // needed to complete the tail of the merged list
		   return head;

		}
	
}
