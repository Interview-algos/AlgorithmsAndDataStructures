/**
 * Reverse a Linked List in groups of given size | Set 2
Given a linked list, write a function to reverse every k nodes (where k is an input to the function).

Examples:

Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3 
Output:  3->2->1->6->5->4->8->7->NULL. 

Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
Output:  5->4->3->2->1->8->7->6->NULL.
 */

package linkedlist;

import java.util.Stack;

public class ReverseLinkedListInSet {
	
	public static void main(String[] args) {
		
		LLinkedList LL1 = new LLinkedList();

		LL1.addAtStart(9);
		LL1.addAtStart(8);
		LL1.addAtStart(7);
		LL1.addAtStart(6);
		LL1.addAtStart(5);
		LL1.addAtStart(4);
		LL1.addAtStart(3);
		LL1.addAtStart(2);
		LL1.addAtStart(1);
		
		Node head = reverse(LL1.getHead(),3);
		LL1.printList(head);
		
	}
	
	
	public static Node reverse(Node headA, int k){
		Stack<Node> stack = new Stack<Node>() ;
		int count = 0;
		Node currNode = headA ;
		Node prevNode=null;
		while(currNode!=null){
			count = 0 ;
		while(count<k &&  currNode!=null){
			
			stack.push(currNode);
			currNode = currNode.nextNode ;
			count++ ;
		}
		
		while(stack.size() >0){
			if(prevNode==null){
				prevNode = stack.pop() ;
				headA = prevNode ;
			}
 			
			else{
				prevNode.nextNode = stack.pop();
				prevNode = prevNode.nextNode;
			}
		}
		
	}
		prevNode.nextNode = null ;
		return headA ;
	}
	
}
