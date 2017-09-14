package linkedlist;

public class CountNodesInCircularLinkedList {
	
	
	public static void main(String[] args) {
		
		LinkedList LL1 = new LinkedList();

		LL1.addAtStart(8);
		LL1.addAtStart(7);
		LL1.addAtStart(5);
		LL1.addAtStart(3);
		LL1.addAtStart(1);
		
		Node headA = LL1.makeCircularLinkedList(LL1.getHead());
		countNodes(headA);
		
	}
	
	
	public static void countNodes(Node headA){
		
		Node startNode = headA ;
		Node currNode = headA ; 
		int count=1 ;
		while(currNode.nextNode != startNode){
			
			currNode = currNode.nextNode ;
			count++ ;
		}
		
		System.out.println(count);
		
	}

}
