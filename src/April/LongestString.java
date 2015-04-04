package April;

public class LongestString {

	public int find(char [] A){
		int maxLen = 1;
		int currLen = 1;
		char currChar = A[0];
		int endindex = 0;
		for(int i =1;i<A.length;i++){
			if(A[i]==currChar+1){
				currLen++;
				if(maxLen<currLen){
					maxLen = currLen;
					endindex = i;
				}
			}else{
				currLen = 1;
			}
			currChar = A[i];
		}
		for(int i=endindex-maxLen+1;i<=endindex;i++){
			System.out.print(" " + A[i]);
		}
		return maxLen;
	}
	public static void main(String[] args) {
//		int [] A = {1,2,5,6,7,1,1,2,3,4,5};
		String s = "abcadiefgh";
		LongestString i = new LongestString();
		System.out.println(i.find(s.toCharArray()));
		
		System.out.println('a'+1);

	}

}
