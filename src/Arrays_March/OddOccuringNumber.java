package Arrays_March;
//YES
//Find a number occuring odd number of times in a given array.
public class OddOccuringNumber {

	//we know that X XOR X = 0 so numbers appearing even number of times will be cancelled out
	//and remaining element will the number which is appearing odd number of times 
	public static int findNumber(int [] A){
		int x=0;
		for(int i=0;i<A.length;i++){
			x= x^A[i];
		}
		return x;
	}
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7 };
		System.out.println("Element appearing add number of times: " + findNumber(A));

	}

}
