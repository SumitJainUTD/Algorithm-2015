package Heap_SmallestRangeInKList;

public class SmallestRangeInKList {

	public int size;
	public HeapNode[] Heap;
	public int position;
	static int gMax;
	static int gMin;
	int currMax;
	int range = Integer.MAX_VALUE;

	public SmallestRangeInKList(int k) {
		this.size = k;
		Heap = new HeapNode[k + 1]; // size+1 because index 0 will be empty
		position = 0;
		Heap[0] = new HeapNode(0, -1); // put some junk values at 0th index node
	}

	public int merge(int[][] A, int k, int n) {
		int nk = n * k;
		int count = 0;
		int[] ptrs = new int[k];
		// create index pointer for every list.
		for (int i = 0; i < ptrs.length; i++) {
			ptrs[i] = 0;
		}
		for (int i = 0; i < k; i++) {
			insert(A[i][ptrs[i]], i); // insert the element into heap

		}
		while (count < nk) {
			HeapNode h = extractMin(); // get the min node from the heap.
			int min = h.data; // store node data into result array
			if (range > currMax - min) { // check is current difference > range
				gMin = min;
				gMax = currMax;
				range = gMax - gMin;
			}
			ptrs[h.listNo]++; // increase the particular list pointer
			if (ptrs[h.listNo] < n) { // check if list is not burns out
				insert(A[h.listNo][ptrs[h.listNo]], h.listNo); // insert the
																// next element
																// from the list
			} else {
				return range; // if any of this list
								// burns out, return range
			}
			count++;
		}
		return range;
	}

	public void insert(int data, int listNo) {
		// keep track of max element entered in Heap till now
		if (data != Integer.MAX_VALUE && currMax < data) {
			currMax = data;
		}
		if (position == 0) { // check if Heap is empty
			Heap[position + 1] = new HeapNode(data, listNo); // insert the first
																// element in
																// heap
			position = 2;
		} else {
			Heap[position++] = new HeapNode(data, listNo);// insert the element
															// to the end
			bubbleUp(); // call the bubble up operation
		}
	}

	public HeapNode extractMin() {
		HeapNode min = Heap[1]; // extract the root
		Heap[1] = Heap[position - 1]; // replace the root with the last element
										// in
										// the heap
		Heap[position - 1] = null; // set the last Node as NULL
		position--; // reduce the position pointer
		sinkDown(1); // sink down the root to its correct position
		return min;
	}

	public void sinkDown(int k) {
		int smallest = k;
		// check which is smaller child , 2k or 2k+1.
		if (2 * k < position && Heap[smallest].data > Heap[2 * k].data) {
			smallest = 2 * k;
		}
		if (2 * k + 1 < position && Heap[smallest].data > Heap[2 * k + 1].data) {
			smallest = 2 * k + 1;
		}
		if (smallest != k) { // if any if the child is small, swap
			swap(k, smallest);
			sinkDown(smallest); // call recursively
		}

	}

	public void swap(int a, int b) {
		// System.out.println("swappinh" + mH[a] + " and " + mH[b]);
		HeapNode temp = Heap[a];
		Heap[a] = Heap[b];
		Heap[b] = temp;
	}

	public void bubbleUp() {
		int pos = position - 1; // last position
		while (pos > 0 && Heap[pos / 2].data > Heap[pos].data) { // check if its
																	// parent is
			// greater.
			HeapNode y = Heap[pos]; // if yes, then swap
			Heap[pos] = Heap[pos / 2];
			Heap[pos / 2] = y;
			pos = pos / 2; // make pos to its parent for next iteration.
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = new int[3][];
		A[0] = new int[] { 3, 10, 15, 24 };
		A[1] = new int[] { 1, 9, 12, 20 };
		A[2] = new int[] { 1, 18, 21, 30 };

		SmallestRangeInKList m = new SmallestRangeInKList(A.length);
		int rng = m.merge(A, A.length, A[0].length);
		System.out.println("Smallest Range " + rng + " from " + gMin + " To "
				+ gMax);
	}

}

class HeapNode {
	int data;
	int listNo;

	public HeapNode(int data, int listNo) {
		this.data = data;
		this.listNo = listNo;
	}
}
