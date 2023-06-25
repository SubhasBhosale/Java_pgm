package Array;

public class _1st_max_2nd_max 
{
	public static void main(String[] args) 
	{
		int[] a= {0,3,7,1,5};
		int fis_max=a[0];
		int sec_max=a[0];

		for (int i = 0; i < a.length; i++) 
		{
			if (fis_max<=a[i])
			{
				if(a[i]!=fis_max)
				{
					sec_max=fis_max;
				}
				fis_max=a[i];
			}
			else if(fis_max==sec_max || a[i]>sec_max)
			{
				sec_max=a[i];
			}

		}
		System.out.println(sec_max);
	}
}
