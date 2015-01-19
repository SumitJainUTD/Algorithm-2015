package Array;

public class TOH {

	public void Tower(int n, String src, String aux, String dest){
		if(n==1){
			System.out.println("Move disc "+  n + " from " + src + " to " + dest  );
		}
		else{
			//make recursive call to move n-1 disks to aux nail
			Tower(n-1, src, dest, aux);
			
			//move the nth disc from "A" to "B"
			System.out.println("Move disc " + n + " from " + src + " to " + dest  );
			
			//Move n-1 disc from aux mail to dest tail
			Tower(n-1, aux, src, dest);	
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 4;
		TOH i = new TOH();
		//A, B, C - A is source, B is destination and C is Auxiliary Nail
		i.Tower(n,"A","C","B");
	}
}