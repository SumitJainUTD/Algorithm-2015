package LL_DisplayFrmEnd;

public class DisplayFrmEnd {

	public void backward(Node head){
		if(head!=null){
			backward(head.next);
			System.out.print(" -> " + head.data );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(2);
		head.next =  new Node(4);
		head.next.next =  new Node(6);
		head.next.next.next =  new Node(8);
		head.next.next.next.next =  new Node(10);
		
		DisplayFrmEnd i = new DisplayFrmEnd();
		i.backward(head);
	}

}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}
