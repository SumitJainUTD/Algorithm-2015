package T_InorderIteration;

import java.util.Stack;
public class InorderIretation {

	public void inorderRecursive(Node root) {
		if (root != null) {
			inorderRecursive(root.left);
			System.out.print(root.data + " ");
			inorderRecursive(root.right);
		}
	}

	public void inorderIteration(Node root) {
		Stack<Node> s = new Stack<Node>();
		while (true) {
			// Gp to the left extreme insert all the elements to stack
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			// check if Stack is emtpy, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack , print it and add the nodes at
			// the right to the Stack
			root =s.pop();
			System.out.print(root.data + " ");
			root = root.right;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);

		InorderIretation i = new InorderIretation();
		i.inorderRecursive(root);
		System.out.println();
		i.inorderIteration(root);
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}