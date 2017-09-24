package sreehari;
public class LinkedList{

	 private Node head;

	 private static class Node {
	  private int value;
	  private Node next;

	  Node(int value) {
	   this.value = value;

	  }
	 }

	 public void addToTheLast(Node node) {

	  if (head == null) {
	   head = node;
	  } else {
	   Node temp = head;
	   while (temp.next != null)
	    temp = temp.next;

	   temp.next = node;
	  }
	 }


	 public void printList(Node head) {
	  Node temp = head;
	  while (temp != null) {
	   System.out.format("%d ", temp.value);
	   temp = temp.next;
	  }
	  System.out.println();
	 }

	 // Reverse linkedlist using this function 
	public static Node reverseLinkedList(Node currentNode)
	 {
	// For first node, previousNode will be null
	Node previousNode=null;
	  Node nextNode;
	  while(currentNode!=null)
	  {
	   nextNode=currentNode.next;
	  // reversing the link
	   currentNode.next=previousNode;
	  // moving currentNode and previousNode by 1 node
	   previousNode=currentNode;
	   currentNode=nextNode;
	  }
	  return previousNode;
	 }

	 public Node findMiddleNode(Node head)
	 {
	 Node slowPointer, fastPointer; 
	  slowPointer = fastPointer = head; 
	 
	  while(fastPointer !=null) { 
	   fastPointer = fastPointer.next; 
	   if(fastPointer != null && fastPointer.next != null) { 
	    slowPointer = slowPointer.next; 
	    fastPointer = fastPointer.next; 
	   } 
	  } 
	 
	  return slowPointer; 
	 
	 }
	 
	 public Node nthFromLastNode(Node head,int n)
	 {
	  Node firstPtr=head;
	  Node secondPtr=head;
	  
	  for (int i = 0; i < n; i++) {
	   firstPtr=firstPtr.next;
	   
	  }
	  
	  while(firstPtr!=null)
	  {
	   firstPtr=firstPtr.next;
	   secondPtr=secondPtr.next;
	  }
	  
	  return secondPtr;
	 }
	 
	 public boolean ifLoopExists() {
		  Node fastPtr = head;
		  Node slowPtr = head;
		  while (fastPtr != null && fastPtr.next != null) {
		   fastPtr = fastPtr.next.next;
		   slowPtr = slowPtr.next;
		   if (slowPtr == fastPtr)
		    return true;
		 
		  }
		  return false;
		 }
	 
	 public static void main(String[] args) {
	  LinkedList list = new LinkedList();
	  // Creating a linked list
	  Node head=new Node(5);
	  list.addToTheLast(head);
	  list.addToTheLast(new Node(6));
	  list.addToTheLast(new Node(7));
	  list.addToTheLast(new Node(1));
	  list.addToTheLast(new Node(2));
	 
	  list.printList(head);
	  //Reversing LinkedList
	  //Node reverseHead=reverseLinkedList(head);
	  //System.out.println("After reversing");
	  //list.printList(reverseHead);
	 Node middle = list.findMiddleNode(head);
	  System.out.println("Middle Element");
	  System.out.println(middle.value);;
	 }

	}