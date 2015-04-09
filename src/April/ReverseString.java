package April;

public class ReverseString {

	public void reverse(String s, int x){
		if(x>(s.length()/2)){
			System.out.println(s);
		}else{
			int len = s.length();
			System.out.println(len);
			s = s.charAt(len-x-1) + s.substring(x+1,len-x-1 ) + s.charAt(x);
			System.out.println(s);
			reverse(s, x+1);
		}
	}
	public static void main(String[] args) {
		String s = "Sumit";
		ReverseString r = new ReverseString();
		r.reverse(s, 0);

	}

}
