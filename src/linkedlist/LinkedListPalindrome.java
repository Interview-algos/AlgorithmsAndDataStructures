package linkedlist;

import java.util.Stack;

public class LinkedListPalindrome {
	
	public static void main(String[] args) {
		StringLinkedList LL1 = new StringLinkedList();
		LL1.addAtStart("m");
		LL1.addAtStart("a");
		LL1.addAtStart("d");
		LL1.addAtStart("a");
		LL1.addAtStart("m");
		System.out.println("is Palindorme : " + isPalindrome(LL1.getHead()));
		
		
		StringLinkedList LL2 = new StringLinkedList();
		LL2.addAtStart("m");
		LL2.addAtStart("a");
		LL2.addAtStart("d");
		LL2.addAtStart("a");
		LL2.addAtStart("d");
		System.out.println("is Palindorme : " + isPalindrome(LL2.getHead()));
		
		
		
		StringLinkedList LL3 = new StringLinkedList();
		LL3.addAtStart("m");
		LL3.addAtStart("o");
		LL3.addAtStart("o");
		LL3.addAtStart("m");
	
		System.out.println("is Palindorme : " + isPalindrome(LL3.getHead()));
		
		
		
	}
	
	
	public static boolean isPalindrome(sNode head){
		
		sNode slow = head;
		sNode fast = head ;
		Stack<String> stack = new Stack<String>();
		
		while(fast!=null && fast.nextNode!=null){
			stack.push(slow.data);
			slow =slow.nextNode ;
			fast = fast.nextNode.nextNode;
	
		}
		
		if(fast!=null){
			slow=slow.nextNode ;
			
		}
		
		while(slow!=null){
			String a = stack.pop();
			if(slow.data!=a){
				return false ;
			}
			
			slow =slow.nextNode ;
		}
		
		return true;
	}

}
