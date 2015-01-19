package Strings;

import java.lang.reflect.Array;

public class ConvertStrings {

	public String convert(String strA, String strB){
		char a[] = strA.toCharArray();
		char b[] = strB.toCharArray();
		int i=0;
		int j=0;
		while(i<b.length){
			j=i;
			while(b[i]!=a[j]){//find the index in stringA 
				j++;
			}
			//found the index, now we need swapping 
			while(j>i){
				char x = a[j];
				a[j]=a[j-1];
				a[j-1]=x;
				j--;
			}
			i++;
		}
		return String.valueOf(a);
	}
	
	public static void main(String[] args) {
		 String strA = "sumit123jain";
		 String strB = "jainsum1i2t3";
		 ConvertStrings c = new ConvertStrings();
		 System.out.println("Converted String is " + c.convert(strA, strB));
		 
				 

	}

}
