package sreehari;

public class LinkedList1 {
	public Node start;
	public Node end;
	
	public int size;
	
	public LinkedList1() {
		start = null;
		end= null;
		size=0;
	}
	
	public boolean isEmpty () {
		return start ==null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void add(String value) {
		Node ptr = new Node(value, null);
		size++;
		if (start == null) {
			start = ptr;
			end = start;
		} else {
			end.setLink(ptr);
			end = ptr;
		}
		
	}
	
	public void display() {
		if (size == 0) {
			System.out.println("empty\n");
			return;
		} 
		if (start.getLink() == null) {
				System.out.print(start.getData());
				return;
		}
				
		Node ptr = start;
		System.out.print(ptr.getData() + " -> ");
		ptr = start.getLink();
		
		while (ptr.getLink()!=null) {
			System.out.print(ptr.getData() + " -> ");
			ptr = ptr.getLink();
		}
		
		System.out.println(ptr.getData());
		
	}
	
	public LinkedList1 reverse (LinkedList1 list) {
		if (list.size == 0) {
			System.out.println("Empty");
		}
		
		if (list.size == 1) {
			return list;
		}
		
		Node current = list.start;
		Node next = null;
		Node prev = null;
		
		while (current.getLink()!=null) {
			next = current;
			prev = next;
			current = prev;
			
		}
		return null;
	}
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.add("a");
		list.add("b");
		list.add("c");
		list.display();
		
		LinkedList1 revList = list.reverse(list);
		
		revList.display();
		
		
	}
}
