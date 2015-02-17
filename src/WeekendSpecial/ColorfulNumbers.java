package WeekendSpecial;

import java.util.Arrays;
import java.util.Hashtable;

public class ColorfulNumbers {

	// Colorful Number:
	// A number can be broken into different sub-sequence parts. Suppose, a
	// number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. And
	// this number is a colorful number, since product of every digit of a
	// sub-sequence are different. That is, 3 2 4 5 (3*2)=6 (2*4)=8 (4*5)=20
	// (3*2*4)= 24 (2*4*5)= 40
	// But 326 is not a colorful number as it generates 3 2 6 (3*2)=6 (2*6)=12.
	// You have to write a function that tells if the given number is a colorful number or not.
//	Appraoch
	// insert all the digits into hast table
	//create a powerset except empty set
	//multiply all the digits in the individual powerset and insert into Hash Table.
	// if any point, number already present in the Hash table, return false
	Hashtable<Integer, Integer> ht = new Hashtable<>();
	boolean [] used; // for creating powerset, every digit, either it will be selected or not
	public int [] getdigits(int Number){
		int length = String.valueOf(Number).length();
		int A [] = new int [length];
		int counter = length-1; //start filling from the end
		while(Number>0){
			int x = Number%10;
			Number = Number/10;
			A[counter]=x;
			counter--;
		}
		return A;
	}
	public boolean getColorFul(int Number){
		ht.clear();
		int [] A = getdigits(Number);
		used = new boolean[A.length];		
		return powerSet(A, used, 0);
	}
	public boolean powerSet(int [] A, boolean [] used, int x){
		if(x==used.length-1){
			used[x] = false;
			boolean b = insertInHash(A, used);
			if(b){
				used[x] = true;
				return insertInHash(A, used);
			}else{
				return false;
			}
		}
		used[x] = false;
		boolean p = powerSet(A, used, x+1);
		used[x] = true;		
		return p & powerSet(A, used, x+1);
	}
	public boolean insertInHash(int [] A, boolean [] used){
		int Sum=0;
		for(int i = 0;i<used.length;i++){
			if(used[i]){
				if(Sum==0){
					Sum =A[i]; 
				}
				else{
					Sum*=A[i];
				}
				
			}
		}
		if(ht.containsKey(Sum)){			
			return false;
		}else{
			ht.put(Sum, 1);
			return true;
		}
		
	}
	public static void main(String[] args) {
		ColorfulNumbers c = new ColorfulNumbers();
		System.out.println(" 326 Colorful?? " + c.getColorFul(326));
		System.out.println(" 3245 Colorful?? " + c.getColorFul(3245));

	}

}
