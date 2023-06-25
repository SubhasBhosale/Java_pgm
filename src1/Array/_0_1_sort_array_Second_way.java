package Array;

public class _0_1_sort_array_Second_way 
{
	public static void main(String[] args) 
	{
		int[] a= {0,0,1,0,1,0,1,1};

		int start=0;
		int end=a.length-1;

		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]==0) 
			{
				a[start]=a[i];
				start++;
			}
			else if (a[i]==1)
			{
				a[end]=a[i];
				end--;
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}