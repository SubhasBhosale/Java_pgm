package Array_without_collection;

import java.util.HashSet;

public class inetegr_occurance 
{
	public static void main(String[] args) 
	{
		int[] a= {2,5,2,1,1,9,3,4,5};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int count=1;
		for (int i = 0; i < a.length; i=i+count)
		{
			count=1;
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
	}
}
