package T_DeleteTree;

public class T_DeleteTree {

	public Node deleteTree(Node root){
		if(root!=null){
			deleteTree(root.left);			
			deleteTree(root.right);
			root = null;
			return root;
		}
		return null;
	}
	public void printTree(Node root){
		if(root!=null){
			printTree(root.left);
			System.out.print(root.data + " ");
			printTree(root.right);
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

		T_DeleteTree i = new T_DeleteTree();
		i.printTree(root);
		Node newroot = i.deleteTree(root);
		if(newroot==null){
			System.out.println("\n Tree is deleted");
		}
		

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