package April;
//NO
import java.util.Arrays;

public class NLengthStringFromKNumbers {
	int [] A;
	public NLengthStringFromKNumbers(int n) {
		A = new int[n];
	}
	public void print(int n, int k){
		if(n<=0){
			System.out.println(Arrays.toString(A));
		}else{
			for(int i=1;i<=k;i++){
				A[n-1]=i;
				print(n-1, k);
			}
		}		
	}
	
	
	public static void main(String[] args) {
		int n = 2;
		int k = 3;
		NLengthStringFromKNumbers i = new NLengthStringFromKNumbers(n);
		i.print(n, k);

	}

}
