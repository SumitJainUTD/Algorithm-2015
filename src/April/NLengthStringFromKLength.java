package April;

public class NLengthStringFromKLength {
	char A [];
	public NLengthStringFromKLength(int n) {
		A = new char[n];
	}
	public void print(int n, char [] k){
		if(n<=0){
			System.out.println(String.valueOf(A));
		}else{
			for(int i=0;i<k.length;i++){
				A[n-1] = k[i];
				print(n-1, k);
			}
		}
	}
	public static void main(String[] args) {
		String k = "SUMIT";
		int n = 2;
		NLengthStringFromKLength i = new NLengthStringFromKLength(n);
		i.print(n, k.toCharArray());
		

	}

}
