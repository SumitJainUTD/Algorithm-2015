package Bloomberg;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
	
	static class PQsort implements Comparator<Integer> {
		 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
	PriorityQueue<Integer> pq;
	int size;

	public PQ(){
		PQsort pqs = new PQsort();
		pq = new PriorityQueue<Integer>(10,pqs );
		size=0;
	}
	
	public void insert(int x){
		pq.offer(x);
		size++;
	}
	public int extractMin(){
		size--;
		return pq.poll();
	}
	public void display(){
		System.out.println(pq);
	}
	
	public static void main(String[] args) {
		PQ i = new PQ();
		i.insert(1);i.insert(7);
		i.insert(10);i.insert(8);
		i.insert(3);i.insert(2);
		i.display();
		System.out.println(i.extractMin());
		System.out.println(i.extractMin());
		System.out.println(i.extractMin());

	}
	
		 
		
	

}
