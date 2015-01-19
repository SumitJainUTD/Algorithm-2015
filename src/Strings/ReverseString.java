package Strings;

public class ReverseString {

	public String reverse(String a){
		if(a.length()==0){
			return "";
		}
		int len = a.length();
		return a.substring(len-1, len) + reverse(a.substring(0, len-1)); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "sumit jain";
		ReverseString i = new ReverseString();
		System.out.println(i.reverse(a));

	}

}
