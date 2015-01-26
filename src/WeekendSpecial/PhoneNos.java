package WeekendSpecial;

public class PhoneNos {
	// Given number of digits of a phone number and number of disallowed digits
	// as input, find all permutations of numbers which do not have two adjacent
	// numbers the same, i.e. 1232 is allowed but not 1223. Disallowed digits
	// can be upto 3, and can be included along with the phone number. Also the
	// phone number should start with 4 if it contains the number 4.
	/**
	 * @param args
	 */
	public static int n1,n2,n3;
	public static void generate(int A[],int pos,int len)
	{
	    if(pos==len)
	    {
	        for(int j=0;j<len;j++)
	            System.out.print(A[j]);
	        System.out.println();
	        return;
	    }
	    for(int i=0;i<=9;i++)
	    {
	        while((i==n1 || i==n2 || i==n3) || (pos>0 && A[pos-1]==i) || (pos>0 && A[0]!=4 && i==4))
	            i++;
	        if(i>9)
	            continue;
	        A[pos]=i;
	        generate(A,pos+1,len);  
	    }
	}
	
	public static void main(String[] args) {
		n1=2;n2=3;n3=5;
	    int len=9;
	    int A[] = new int [len];
	    generate(A,0,len);
	    

	}

}
