package Arrays_March;
//Yes
public class findMissingNo {
	// Do the XOR if 1 to n say its A
	// Do the XOR of given array say its B
	// Do the XOR of A and B will give the missing no
	public static int missingNo(int arrA[], int range) {
		int A = 0;
		int B = 0;
		for (int i = 1; i <= range; i++) {
			A = A ^ i;
		}
		for (int i = 0; i < arrA.length; i++) {
			B = B ^ arrA[i];
		}
		return A ^ B;
	}

	public static void main(String[] args) {
		int A[] = { 1, 2, 7, 6, 3, 4 };
		int range = 7;
		System.out.println("MIssing No is :" + missingNo(A, range));

	}

}
