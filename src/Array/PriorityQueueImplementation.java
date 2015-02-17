package Array;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {

	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(2);pq.add(12);pq.add(22);pq.add(4);pq.add(5);pq.add(1);
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.peek());
		
	}

}
