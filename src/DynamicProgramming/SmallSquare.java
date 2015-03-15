package DynamicProgramming;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class SmallSquare {

	public void find(int n){
		Hashtable<Integer, Integer> ht = factor(n);
		int size = ht.size();
		int [] minNum = new int[n+1];
		minNum[0]=0;
		minNum[1]=1;
		 Set<Integer> keys = ht.keySet();
	        for(Integer key: keys){
	        	int a = ht.get(key);
	        	//either we will use 'a' or not	     
	        	
	        }
	        
	}
	public Hashtable<Integer, Integer> factor(int n){
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1, 1);
		for(int i=2;i*i<n;i++){
			while(n%i==0){
				if(ht.contains(i)==false){
					ht.put(i, 1);
				}
			}
		}
		return ht;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
