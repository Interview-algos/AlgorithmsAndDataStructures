package linkedlist;

public class StackUsingLinkedList {
	
	static Node top;
	
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(new Node(1));
		stack.push(new Node(2));
		stack.push(new Node(3));
		stack.print(top);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(new Node(4));
		stack.print(top);
	}
		public Node peek() {
			if (top != null) {
				return top;
			}

			return null;
		}

		public Node pop() {
			if (top == null) {
				return null;
			} else {
				Node temp = new Node(top.data);
				top = top.nextNode;
				return temp;
			}
		}

		public void push(Node n) {
			if (n != null) {
				n.nextNode = top;
				top = n;
			}
		}
		
		public void print(Node top){
			while(top!=null){
				System.out.println(top.data);
				top =top.nextNode ;
			}
		}
	}


