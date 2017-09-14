/*
 * Find the fractional (or n/k – th) node in linked list
Given a singly linked list and a number k, write a function to find the (n/k)-th element, where n is the number of elements in the list. We need to consider ceil value in case of decimals.

Examples:

Input : list = 1->2->3->4->5->6 
        k = 2
Output : 3
Since n = 6 and k = 2, we print (6/2)-th node 
which is 3.

Input : list = 2->7->9->3->5
        k = 3
Output : 7 
Since n is 5 and k is 3, we print ceil(5/3)-th 
node which is 2nd node, i.e., 7.
Recommended: Please try your approach on {IDE} first, before moving on to the solution.

Take two pointers temp and fractionalNode and initialize them with null and head respectively.
For every k jumps of the temp pointer, make one jump of the fractionalNode pointer.
 */


package linkedlist;

public class FindNthNode {
	
	
	public static void main(String[] args) {
		
		LinkedList LLa = new LinkedList();

		LLa.addAtStart(5);
		LLa.addAtStart(3);
		LLa.addAtStart(9);
		LLa.addAtStart(7);
		LLa.addAtStart(2);
		
		
		Node kNode = findNthNode(LLa.getHead(), 3) ;
		System.out.println("Node at N/Kth element is : " + kNode.getData());
		
		
		LinkedList LLb = new LinkedList();

		LLb.addAtStart(6);
		LLb.addAtStart(5);
		LLb.addAtStart(4);
		LLb.addAtStart(3);
		LLb.addAtStart(2);
		LLb.addAtStart(1);
		
		Node kNode2 = findNthNode(LLb.getHead(), 2) ;
		System.out.println("Node at N/Kth element is : " + kNode2.getData());
	}
	
	
	
	public static Node findNthNode(Node headA, int k){
		
			
		Node prevNode = null ;
		Node fastNode = headA ; 
		Node slowNode = headA ;
		
		while(fastNode!=null && fastNode.nextNode !=null){
			
			prevNode = slowNode ;
			slowNode = slowNode.nextNode ;
			
			int i = k ;
			while(i!=0 ){
				
				if(fastNode.nextNode!=null)
					fastNode = fastNode.nextNode ;
				i-- ;
			}
			
		}
		
		return prevNode ;
		
	}
	

}
