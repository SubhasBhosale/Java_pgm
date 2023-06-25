package Array;

import java.util.HashSet;

public class RemoveDupliactesAndCount {

	public static void main(String[] args) {
		int[] arr= {2,4,4,6,5,6};
		HashSet<Object> set = new	HashSet<Object>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		//	System.out.println(set);    ==>> [2, 4, 5, 6]
		for (Object s : set)
		{
			int count=0;
			for (int i = 0; i < arr.length; i++)
			{
				Object j = arr[i];
				if (s==j)
				{
					count++;
				}
			}
			System.out.println(s+" ==>>> "+count+" times");

		}
	}
}
//2 ==>>> 1 times
//4 ==>>> 2 times
//5 ==>>> 1 times
//6 ==>>> 2 times

