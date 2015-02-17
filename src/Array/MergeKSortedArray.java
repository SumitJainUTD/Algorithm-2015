package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArray {

	PriorityQueue<minHeapNode> pq;
	int[] result;

	public MergeKSortedArray(int k) {
		pq = new PriorityQueue<minHeapNode>();
	}

	public int[] merge(int[][] A, int k, int n) {
		int nk = n * k;
		result = new int[nk];
		int count = 0;
		int[] ptrs = new int[k];
		// create index pointer for every list.
		for (int i = 0; i < ptrs.length; i++) {
			ptrs[i] = 0;
		}
		for (int i = 0; i < k; i++) {
			if (ptrs[i] < n) {
				insert(A[i][ptrs[i]], i); // insert the element into heap
			} else {
				insert(Integer.MAX_VALUE, i); // if any of this list burns out,
												// insert +infinity
			}
		}
		while (count < nk) {
			minHeapNode h = extractMin(); // get the min node from the heap.
			result[count] = h.data; // store node data into result array
			ptrs[h.listNo]++; // increase the particular list pointer
			if (ptrs[h.listNo] < n) { // check if list is not burns out
				insert(A[h.listNo][ptrs[h.listNo]], h.listNo); // insert the
																// next element
																// from the list
			} else {
				insert(Integer.MAX_VALUE, h.listNo); // if any of this list
														// burns out, insert
														// +infinity
			}
			count++;
		}
		return result;
	}

	public void insert(int data, int listNo) {
		pq.add(new minHeapNode(data, listNo));
	}

	public minHeapNode extractMin() {
		return pq.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = new int[5][];
		A[0] = new int[] { 1, 5, 8, 9 };
		A[1] = new int[] { 2, 3, 7, 10 };
		A[2] = new int[] { 4, 6, 11, 15 };
		A[3] = new int[] { 9, 14, 16, 19 };
		A[4] = new int[] { 2, 4, 6, 9 };
		MergeKSortedArray m = new MergeKSortedArray(A.length);
		int[] op = m.merge(A, A.length, A[0].length);
		System.out.println(Arrays.toString(op));
	}
}

// Every Node will store the data and the list no from which it belongs
class minHeapNode {
	int data;
	int listNo;

	public minHeapNode(int data, int listNo) {
		this.data = data;
		this.listNo = listNo;
	}
}
