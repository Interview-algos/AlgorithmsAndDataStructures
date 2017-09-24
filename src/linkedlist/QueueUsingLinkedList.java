package linkedlist;

public class QueueUsingLinkedList {
	static Node first ;
	static Node last ;
	
	public static void main(String[] args) {
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(new Node(1));
		queue.enqueue(new Node(2));
		queue.enqueue(new Node(3));
		queue.print(first);
		System.out.println(queue.dequeue());
		
	}


		

		public void enqueue(Node n) {
			if (first == null) {
				first = n;
				last = first;
			} else {
				last.nextNode = n;
				last = n;
			}
		}

		public Node dequeue() {
			if (first == null) {
				return null;
			} else {
				Node temp = new Node(first.data);
				first = first.nextNode;
				return temp;
			}
		}
		
		
		public void print(Node head){
			Node node =head ;
			while(node!=null){
				System.out.println(node.getData());
				node =node.nextNode;
			}
		}
	}


