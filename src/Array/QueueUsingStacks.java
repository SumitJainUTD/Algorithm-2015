package Array;

import java.util.Stack;

public class QueueUsingStacks {

	Stack<Integer> stack1 = new Stack<>(); //act as  back of the Queue
	Stack<Integer> stack2 = new Stack<>(); // act as the front of the Queue

	public void push(int x) {  // push into stack 1
		stack1.push(x);
	}

	public int peek() {
		if (stack2.isEmpty()) {
			moveItems(stack1, stack2);
		}
		return stack2.peek(); // return the top element in stack2
	}

	public int pop() {
		if (stack2.isEmpty()) {
			moveItems(stack1, stack2);
		}
		return stack2.pop(); // return the top element in stack2
	}

	public void moveItems(Stack<Integer> s1, Stack<Integer> s2) {
		while (!stack1.isEmpty()) {
			s2.push(s1.pop()); // move all the elements from stack 1 to stack 2
		}
	}

	public static void main(String[] args) {
		QueueUsingStacks q = new QueueUsingStacks();
		q.push(10);
		q.push(20);
		q.push(30);
		System.out.println("POP from Queue " + q.pop());

	}

}
