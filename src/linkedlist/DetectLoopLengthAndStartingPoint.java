/**
 * 
 * 
 * 
 * Find length of loop in linked list
Write a function detectAndCountLoop() that checks whether a given Linked List contains loop and if loop is present then returns count of nodes in loop. For example, loop is present in below linked list and length of loop is 4. If loop is not present, then function should return 0.



Recommended: Please try your approach on {IDE} first, before moving on to the solution.

We know that Floyd’s Cycle detection algorithm terminates when fast and slow pointers meet at a common point. We also know that this common point is one of the loop nodes (2 or 3 or 4 or 5 in the above diagram). We store the address of this in a pointer variable say ptr2. Then we start from the head of the Linked List and check for nodes one by one if they are reachable from ptr2. When we find a node that is reachable, we know that this node is the starting node of the loop in Linked List and we can get pointer to the previous of this node.
 * 
 */


package linkedlist;

public class DetectLoopLengthAndStartingPoint {
	public static void main(String[] args) {
		
		
		LinkedList LL1 = new LinkedList();

		LL1.addAtStart(8);
		LL1.addAtStart(7);
		LL1.addAtStart(5);
		LL1.addAtStart(3);
		LL1.addAtStart(1);
		
		Node n = LL1.makeLoop(LL1.getHead()); 
		n = detectLoop(n);
		countNodesInLoop(n);
		findStartingNodeOfTheLoop(LL1.getHead());
		
	//	LL1.printList(headA);
		
		
	}
	
	//detect if loop 
	public static Node detectLoop(Node headA){
		
		Node slowNode = headA ;
		Node fastNode = headA ;
		while(fastNode!=null && fastNode.nextNode!=null){
			slowNode = slowNode.nextNode;
			fastNode = fastNode.nextNode ;
			
			if(slowNode == fastNode){
				System.out.println("Loop detected");
				return slowNode ;
			}
			
			
		}
		return null;
		
		
	}
	
	
	//count no of nodes in the loop
	public static void countNodesInLoop(Node n){
		
		Node temp = n ;
		int count = 1 ;
		while(temp.nextNode != n){
			temp = temp.nextNode ;
			count ++ ;
		}
		
		System.out.println("No of nodes in loop : " + count);
		
		
	}
	
	
	//find the starting node of the loop
	
	/**
	 * Not working
	 * @param head
	 */
	public static void findStartingNodeOfTheLoop(Node head){
		
		Node currNode = head ; 
		Node startNode = head ; 
		
		while(currNode.nextNode != startNode){
			while(currNode.nextNode != startNode){
			
				currNode = currNode.nextNode ;
			}
		
		startNode = startNode.nextNode ;
		}
		
		System.out.println("startNode is :" + startNode.getData());
	}

}
