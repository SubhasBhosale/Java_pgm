package array;

import java.util.LinkedHashSet;

public class position_Of_The_No_InArray 
{
	public static void main(String[] args) {
		int[] a= {2,4,4,6,5,6};     
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		//follow order of insertion ,remove duplicates
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer s : set) 
		{
			for (int j = 0; j < a.length; j++) //
			{
				if(s==a[j])   //comparing the elements
				{
					System.out.println(a[j]+" is in "+(j+1)+" postion");
					break;
				}
			}
		}
		for (Integer r : set) {
			System.out.print(r+" ");
		}
	}
}
