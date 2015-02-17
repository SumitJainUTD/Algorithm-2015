package Array;

import java.util.Stack;

public class TrackMaxInStack {

	// objective here is to keep track of maximum value in a stack of integers
	// create another another Stack which will keep track of maximum
	Stack<Integer> main = new Stack<>();
	Stack<Integer> track = new Stack<>();

	public void insert(int x) {
		if (main.isEmpty()) { // if stack is empty, insert the number in both
								// stacks
			main.add(x);
			track.add(x);
		} else {
			// check if number in Stack(track) is bigger than x
			// which ever is bigger, insert it into Stack

			int a = track.peek();
			track.add(Math.max(a, x));
			main.add(x); // insert it into main stack.
		}
	}

	public int remove() {
		if (!main.isEmpty()) { // pop the top elements
			track.pop();
			return main.pop();
		}
		return 0;
	}

	public int getMax() {
		return track.peek();
	}

	public static void main(String[] args) {
		TrackMaxInStack i = new TrackMaxInStack();
		i.insert(4);
		i.insert(2);
		i.insert(14);
		i.insert(1);
		i.insert(18);
		System.out.println("Max Element is " + i.getMax());
		System.out.println("Removing Element " + i.remove());
		System.out.println("Max Element is " + i.getMax());
	}

}
