package practice_java;

import java.util.LinkedHashSet;

public class removeDupliactesAndCount {

	public static void main(String[] args) {
		int[] a= {2,4,4,6,5,6};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for (Integer s : set) 
		{
			int count=0;
			for (int i = 0; i < a.length; i++)
			{
				if (s==a[i])
				{
					count++;
				}
			}
			System.out.println(s+" "+count);
		}
	}

}
