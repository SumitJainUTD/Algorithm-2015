package T_PostOrder;

import java.util.Stack;

public class PostorderTree {

	public void postOrderRecursive(Node root) {
		if (root != null) {			
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.print(root.data + " ");
		}
	}

	public void preorderIteration(Node root) {
		Stack<Node> s = new Stack<Node>();
		while (true) {
			// First print the root node and then add left node
			while (root != null) {
				System.out.print(root.data + " ");
				s.push(root);
				root = root.left;
			}
			// check if Stack is emtpy, if yes, exit from everywhere
			if (s.isEmpty()) {
				return;
			}
			// pop the element from the stack and go right to the tree
			root = s.pop();
			root = root.right;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);

		PostorderTree i = new PostorderTree();
		i.postOrderRecursive(root);
		System.out.println();
		//i.preorderIteration(root);
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