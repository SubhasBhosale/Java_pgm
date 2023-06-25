package interview_quetions;

import java.util.HashSet;

public class SONY_4 
{
	public static void main(String[] args) 
	{
		int[] a= {2,3,7};					//	o/p==>>  1 4 5 6 8 9 10 
		HashSet set = new	HashSet<>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		
		
		for (int i = 1; i <= 10; i++) 
		{
			if(!(set.contains(i)))
			{
				System.out.print(i+" ");
			}
		}
	}
}
