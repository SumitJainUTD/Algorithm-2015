package Array;

import java.util.Arrays;

public class Hp_lessThanK {

	public int size;
	public static int[] mH;
	public int position;

	public Hp_lessThanK(int size) {
		this.size = size;
		mH = new int[size + 1]; // size+1 because index 0 will be empty
		position = 0;
	}

	public void createHeap(int[] arrA) {
		if (arrA.length > 0) {
			for (int i = 0; i < arrA.length; i++) {
				insert(arrA[i]);
			}
		}
	}

	public void display() {
		for (int i = 1; i < mH.length; i++) {
			System.out.print(" " + mH[i]);
		}
		System.out.println("");
	}

	public void insert(int x) {
		if (position == 0) { // check if Heap is empty
			mH[position + 1] = x; // insert the first element in heap
			position = 2;
		} else {
			mH[position++] = x; // insert the element to the end
			bubbleUp(); // call the bubble up operation
		}
	}

	public void bubbleUp() {
		int pos = position - 1; // last position
		while (pos > 0 && mH[pos / 2] > mH[pos]) { // check if its parent is
													// greater.
			int y = mH[pos]; // if yes, then swap
			mH[pos] = mH[pos / 2];
			mH[pos / 2] = y;
			pos = pos / 2; // make pos to its parent for next iteration.
		}
	}
	public void printLessThanK(int k, int currPos){
		if(currPos>=position){
			return;
		}
		if(mH[currPos]<k){
			System.out.print(mH[currPos] + " ");
		}
		printLessThanK(k, 2*currPos);  //call recursively left child
		printLessThanK(k, 2*currPos+1);  //call recursively right child
	}


	public static void main(String args[]) {
		int arrA[] = { 3, 2, 1, 7, 8, 4, 10, 16, 12 };
		System.out.print("Original Array : " + Arrays.toString(arrA));
		System.out.println();
		Hp_lessThanK m = new Hp_lessThanK(arrA.length);		
		m.createHeap(arrA);
		System.out.print("Min-Heap : " + Arrays.toString(mH));
		System.out.println("Elements less than 9 ");
		m.printLessThanK(9, 1);
		

	}

}
