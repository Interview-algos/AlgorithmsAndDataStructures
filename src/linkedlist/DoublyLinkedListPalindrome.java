package linkedlist;

import chapter4.DoublyLinkedList;
import chapter4.DoublyLinkedNode;

// Find the doubly linked list is palindrome or not

public class DoublyLinkedListPalindrome {
	
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList =  new DoublyLinkedList();
		doublyLinkedList.insertAtHead(1);
		doublyLinkedList.insertAtHead(0);
		doublyLinkedList.insertAtHead(0);
		doublyLinkedList.insertAtHead(1);
		
		
		System.out.println("Doubly Linked List \n" + doublyLinkedList);
		
		
		DoublyLinkedListPalindrome DoublyLinkedListPalindrome =  new DoublyLinkedListPalindrome();
		boolean isPalindrome = DoublyLinkedListPalindrome.isPalindrome(doublyLinkedList);
		System.out.println("is Plaindrome ? : " + isPalindrome);
	}
	
	
	public Boolean isPalindrome(DoublyLinkedList doublyLinkedList){
		DoublyLinkedNode head = doublyLinkedList.getHead() ;
	
		
		DoublyLinkedNode lastNodePointer = head ;
		DoublyLinkedNode FirstNodePointer = head ;
		while(lastNodePointer.getNextNode() != null){
			
			lastNodePointer = lastNodePointer.getNextNode() ; 
			
		}
		
		
		int length = doublyLinkedList.length();
		boolean isPalindrome =false ;
		while(FirstNodePointer.getNextNode() != null ){
			
			if(FirstNodePointer.getData() == lastNodePointer.getData()){
				FirstNodePointer = FirstNodePointer.getNextNode();
				lastNodePointer = lastNodePointer.getPreviousNode();
				isPalindrome =  true ;
			}
			
			else{
				isPalindrome = false;
				break ;
			}
			
	
		}
		return isPalindrome;
		
	
	}
	
	

}
