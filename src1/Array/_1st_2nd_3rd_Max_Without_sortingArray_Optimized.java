package Array;

public class _1st_2nd_3rd_Max_Without_sortingArray_Optimized 
{
	public static void main(String[] args) {
			int []a= {0,7,8,9,8,10,10,2,6,9,1}; 		
			int fmax=Integer.MIN_VALUE;
			int smax=Integer.MIN_VALUE;
			int tmax=Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++)
			{
				if(fmax<a[i])
				{
					fmax=a[i];
				}
			}
				int possible=0;
			for (int i = 0; i < a.length; i++)
			{
				if (fmax>a[i]) 
				{
					possible=a[i];
				}
				if (smax<possible)
				{
					smax=possible;
				}
			}
			int possible1=0;
			for (int i = 0; i < a.length; i++)
			{
				if (smax>a[i]) 
				{
					possible1=a[i];
				}
				if (tmax<possible1)
				{
					tmax=possible1;
				}
			}
		System.out.println(fmax);
		System.out.println(smax);
		System.out.println(tmax);
		}

	}


