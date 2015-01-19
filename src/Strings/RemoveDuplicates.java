package Strings;

import java.util.Hashtable;

public class RemoveDuplicates {
	public StringBuilder remove(String input){
		boolean [] ASCII = new boolean[256];
		StringBuilder result = new StringBuilder();
		for(int i = 0;i<input.length();i++){
			char a = input.charAt(i);
			if(ASCII[a]==false){
				ASCII[a]=true;
				result.append(a);
			}		
		}
		return result;
	}
	public static void main(String args[]){
		String str1 = "aaabcdabefabccddaq";
		System.out.println("Original String: " + str1);
		RemoveDuplicates i = new RemoveDuplicates();
		System.out.println("Output: " + i.remove(str1));
	}
}
