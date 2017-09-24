package linkedlist;

/**
 * A lot of people are familiar with the problem of detecting a loop in a linked
 * list. The problem goes as follows: “Given a linked list, what is the
 * algorithm to determine if it has any cycles (loops)?”
 * 
 * The algorithm is pretty straightforward:
 * 
 * We start at the beginning of the linked list with two pointers. The first
 * pointer is incremented through each node of the list. The second pointer
 * moves twice as fast, and skips every other node. If the linked list contains
 * a loop, these two pointers will eventually meet at the same node, thus
 * indicating that the linked list contains a loop. The algorithm is
 * straightforward and it is relatively easy to create a mental model and get an
 * intuitive sense of why it works.
 * 
 * Now, a slight twist to the same question asks: “Given a circular linked list,
 * what is the algorithm to find the first node of the loop.”
 * 
 * For instance, in the circular list A->B->C->D->E->C, the first node of the
 * loop is node C. The first part of the algorithm is identical to the algorithm
 * for finding if there is a loop (above). Once a loop has been found, the
 * following additional steps will give us the starting node of the loop:
 * 
 * Once a loop as been detected (step-3 above), move one of the pointers to the
 * beginning (head) of the linked list. The second pointer remains where it was
 * at the end of step-3. Increment both pointers one node at a time. The node at
 * which the two pointers meet will be the starting node of the loop!
 * 
 * @author rkumar1
 * http://umairsaeed.com/blog/2011/06/23/finding-the-start-of-a-loop-in-a-circular-linked-list/
 * 
 * To remove : find the last node just before the starting poit of the loop and point it to null.This can be done easily  saving prevNode 
 * while identifying the starting position
 */

public class CountNodesInCircularLinkedList {

	public static void main(String[] args) {

		LLinkedList LL1 = new LLinkedList();

		LL1.addAtStart(8);
		LL1.addAtStart(7);
		LL1.addAtStart(5);
		LL1.addAtStart(3);
		LL1.addAtStart(1);

		Node headA = LL1.makeCircularLinkedList(LL1.getHead());
		countNodes(headA);

	}

	public static void countNodes(Node headA) {

		Node startNode = headA;
		Node currNode = headA;
		int count = 1;
		while (currNode.nextNode != startNode) {

			currNode = currNode.nextNode;
			count++;
		}

		System.out.println(count);

	}

}
