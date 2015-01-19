package LL_PairwiseReverse;

public class PairwiseReverse {

	public Node pairReverse(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node x = head.next;
		head.next = x.next;
		x.next = head;
		head.next = pairReverse(head.next);
		return x;
	}
	
//	public Node pairReverseIterate(Node head){
//		while(head!=null && head.next!=null){
//			return head;
//		}
//		Node x = head.next;
//		head.next = x.next;
//		x.next = head;
//		head.next = pairReverse(head.next);
//		return x;
//	}
	
	public void display(Node head){
		Node n=head;
		while(n!=null){
			System.out.print("->" + n.data);
			n=n.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next =  new Node(2);
		head.next.next =  new Node(3);
		head.next.next.next =  new Node(4);
		head.next.next.next.next =  new Node(5);
		
		PairwiseReverse p = new PairwiseReverse();;
		Node x = p.pairReverse(head);
		p.display(x);

	}

}

class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}

