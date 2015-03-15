package T_TreeHeightWithOutrecursion;
//YES
import java.util.LinkedList;
import java.util.Queue;

public class T_TreeHeightWithOutrecursion {

	// use NULL as a marker at every level, so whenever we encounter null, we
	// will increment the height by 1
	public int getHeight(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		int height = 0;
		// add root to the queue
		q.add(root);
		// add null as marker
		q.add(null);
		while (q.isEmpty() == false) {
			Node n = q.remove();
			// check if n is null, if yes, we have reached to the end of the
			// current level, increment the height by 1, and add the another
			// null as marker for next level
			if (n == null) {
				// before adding null, check if queue is empty, which means we
				// have traveled all the levels
				if(!q.isEmpty()){
					q.add(null);
				}
				height++;				
			}else{
				// else add the children of extracted node. 
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}
		}
		return height;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.right = new Node(8);
		
		T_TreeHeightWithOutrecursion i = new T_TreeHeightWithOutrecursion();
		System.out.println("Tree Height " + i.getHeight(root));

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
