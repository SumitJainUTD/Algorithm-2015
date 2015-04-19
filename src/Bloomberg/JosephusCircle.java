package Bloomberg;

public class JosephusCircle {

	public static int findSafe(int n, int k){
		if(n==1){
			return 1;
		}
		return (findSafe(n-1, k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		int n = 3; int k = 2;
		System.out.println(findSafe(n, k));

	}

}
