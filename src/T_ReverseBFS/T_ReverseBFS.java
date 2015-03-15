package T_ReverseBFS;
//YES
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T_ReverseBFS {

	public void reverseBFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);// add the root node to the queue
		while (!q.isEmpty()) {
			// add the children to the queue
			Node n = q.remove();
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
			// add the extracted node to the Stack
			s.add(n);
		}
		// now print all the Node in Stack
		while (s.isEmpty() == false) {
			System.out.print(s.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		T_ReverseBFS i = new T_ReverseBFS();
		i.reverseBFS(root);

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