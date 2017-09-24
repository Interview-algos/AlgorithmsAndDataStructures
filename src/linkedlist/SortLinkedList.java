package linkedlist;

/**
  Given a Singly linked list with each node containing either 0, 1
 * or 2. Write code to sort the list. Input : 1 -> 1 -> 2 -> 0 -> 2 -> 0 -> 1 ->
 * 0 Output : 0 -> 0 -> 0 -> 1 -> 1 -> 1 -> 2 -> 2
 * 
 * Solution: You can do that in O(n).
 * 
 * Traverse the linked list from the beginning and count the number of 0s, 1s
 * and 2s. (Let the counts be p, q, r) Now traverse the linked list again and
 * set first p nodes to 0, q nodes to 1 and r nodes to 2.
 * 
 * @author rkumar1
 *
 */
public class SortLinkedList {

}
