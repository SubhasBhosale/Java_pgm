package Array;

public class _1st_2nd_max_1forLoop 
{
	public static void main(String[] args) 
	{
		int []z= {10,7,8,8,10,2,6,9,9,1,10,10};
		//		int[] a= {0,3,7,1,5};
		int a=z[0];
		int b=z[0];

		for (int i = 0; i < z.length; i++) 
		{
			if (a<=z[i])
			{
				if(a!=z[i])
				{
					b=z[i];
				}
				a=z[i];
			}
			else if(a==b || b < z[i])
			{
				b=z[i];
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}


/*

//int[] a= {0,3,7,1,5};
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
System.out.println(fis_max);
System.out.println(sec_max);
}

 */