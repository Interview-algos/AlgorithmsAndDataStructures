package linkedlist;

public class InsertNodeInMiddleOfLinkedList {
	
	public static void main(String[] args) {
		LinkedList LLa = new LinkedList();

		LLa.addAtStart(7);
		LLa.addAtStart(5);
		LLa.addAtStart(3);
		LLa.addAtStart(1);
		
		
		LinkedList LLb = new LinkedList();

		LLb.addAtStart(10);
		LLb.addAtStart(8);
		LLb.addAtStart(6);
		LLb.addAtStart(4);
		LLb.addAtStart(2);
		
		
		Node a = new Node(20);
		
		
		insert(LLa.getHead() , a);
		insert(LLb.getHead() , a);
		
		
	}
	
	
	
	public static void insert(Node headA, Node a){
		Node previousNode = null;
		Node countNode = headA ;
		Node countNode2 = headA ;
		
		
		
		while(countNode2!= null && countNode2.nextNode != null){
			
			previousNode = countNode;
			countNode = countNode.nextNode;
			countNode2 = countNode2.nextNode.nextNode;
		}
		
		
		
		Node temp = previousNode.nextNode ;
		previousNode.nextNode = a ;
		a.nextNode = temp ;
		
		
		while(headA!=null){
			
			System.out.println(headA.data);
			headA = headA.nextNode;
			
		}
		
		
		
	}
	
	


}
