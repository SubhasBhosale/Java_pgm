package array;

import java.util.LinkedHashSet;

public class printIndexWithoutDuplicate
{
	public static void main(String[] args) {
		int[] a= {2,4,4,6,5,6};     
		//  o/p==>> 2=1 4=2 6=4 5=5
		LinkedHashSet<Integer> set = new LinkedHashSet<>();  //autosorted & remove duplicates
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for(Integer n:set)   //duplicate removed
		{
			for (int j = 0; j < a.length; j++)  //with duplicates
			{
				if(n==a[j])
				{
					System.out.println(n+" ==>> "+(j+1)+" position");
					break;
				}
			}
		}

	}
}
//2 ==>> 1 position
//4 ==>> 2 position
//6 ==>> 4 position
//5 ==>> 5 position
