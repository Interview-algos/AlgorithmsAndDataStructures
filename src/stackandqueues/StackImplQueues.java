package stackandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplQueues {

	Queue<String> q1 = new LinkedList<String>();
	Queue<String> q2 = new LinkedList<String>();

	public static void main(String[] args) {
		StackImplQueues stack = new StackImplQueues();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

	}

	// Push
	public void push(String x) {
		q1.add(x);

	}

	// POP
	public String pop() {
		int a;
		int front = 0;
		int rear = q1.size() - 1;

		if (q1.isEmpty()) {
			return null;
			
		}
		while (front != rear) {
			q2.add(q1.remove());
			front++;
		}

		String ele = q1.remove();
		q1 = q2;
		return ele;
	}

	public String peek() {
		int a;
		int front = 0;
		int rear = q1.size() - 1;

		if (q1.isEmpty()) {
			return null;
		}
		while (front != rear) {
			q2.add(q1.remove());
			front++;
		}
		
		
		String ele = q1.remove();
		q2.add(ele);
		q1 = q2;
		return ele;
	}

}
