package practice_java;

import java.util.LinkedHashSet;

public class position_Of_The_No_InArray {

	public static void main(String[] args) {
		int[] a= {2,4,4,6,5,6};     
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int j = 0; j < a.length; j++)
		{
			set.add(a[j]);
		}
		for (Integer s : set)
		{
			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if (s==a[i])
				{
					System.out.println(s+" "+(i+1));
					break;
				}		
			}
		}
	}

}
