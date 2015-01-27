package WeekendSpecial;

import java.util.ArrayList;

public class SteppingNumber {

	public static void stepNum(int start,int end)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = start;i<=end;i++)
		{
			if(check(i))
				result.add(i);
		}
		System.out.print(result);
	}
	public static boolean check(int i)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(i/10>=1)
		{
			a.add(i%10);
			
			i=i/10;
		}
		a.add(i);
		for(int k =0;k<a.size()-1;k++)
		{
			if(a.get(k)-a.get(k+1)==1||a.get(k+1)-a.get(k)==1)
				continue;
			else
				return false;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		int start = 100;
		int end = 1000;
		stepNum(start,end);
	}

}
