package linkedlist;

/**
 * Repeatedly Delete N nodes after M nodes of a Linked list
 * 
 * @author rkumar1 
 * 			Given a linked list and two integers M and N. Traverse the
 *         linked list such that you retain M nodes then delete next N nodes,
 *         continue the same until end of the linked list.
 * 
 *         Input: M = 2, N = 2 Linked List: 1->2->3->4->5->6->7->8 Output:
 *         Linked List: 1->2->5->6
 * 
 *         The main part of the problem is to maintain proper links between
 *         nodes, make sure that all corner cases are handled.
 *         
 *         Logic : 
 *         1.Take head to currNode and prevNode
 *         2.take previous Node to prevNode 
 *         2.skip currNode M nodes
 *         3.Traverse currNode N nodes
 *         4.Link currNode to prevNode
 *         5.Repeat till currNode!=null
 */
public class DeleteMNodes {

}
