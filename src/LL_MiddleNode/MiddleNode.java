package LL_MiddleNode;

public class MiddleNode {
	
	public Node findMid(Node head){
		Node ptr1 = head;
		Node ptr2 = head;
		int i =0;
		//ptr2 will move with the twice the speed than ptr1
		while(ptr2.next!=null){
			ptr2 = ptr2.next;
			if(i%2==0 && ptr2.next!=null){
				ptr2 = ptr2.next;
				ptr1 = ptr1.next;
			}
		}
		//Now ptr2 has ended , ptr1 will be at the middle
		return ptr1;
	}
	public static void main(String[] args) throws java.lang.Exception {
		Node head = new Node(2);
		head.next =  new Node(4);
		head.next.next =  new Node(6);
		head.next.next.next =  new Node(8);
		head.next.next.next.next =  new Node(10);
		
		MiddleNode i = new MiddleNode();
		// A, B, C - A is source, B is destination and C is Auxiliary Nail
		Node x = i.findMid(head);
		System.out.println("Middle node is  " + x.data);
	}
}

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}
