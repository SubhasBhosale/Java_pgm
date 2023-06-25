package Array;

public class _1_2_3rd_Max_Without_sort
{
	public static void main(String[] args) 
	{
		int[] a = {0,7,8,9,8,10,10,2,6,9,1};
		int fm=a[0];
		int sm=a[0];
		int tm=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (fm<a[i]) 
			{
				tm=sm;
				sm=fm;
				fm=a[i];
			}
			else if(sm<a[i] && fm!=a[i])
			{
				tm=sm;
				sm=a[i];
			}
			else if(tm<a[i] && sm!=a[i] && fm!=a[i])
			{
				tm=a[i];
			}
		}
		System.out.println(fm);
		System.out.println(sm);
		System.out.println(tm);
	}
}