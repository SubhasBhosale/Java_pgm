package practice_java;

public class _1_2_3rd_max {

	public static void main(String[] args) {
		int []a= {0,7,8,9,8,10,10,2,6,9,1}; 		
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
			if (fmax<a[i])
			{
				fmax=a[i];
			}
		}
		int possible=0;
		for (int i = 0; i < a.length; i++) {
			if (smax<a[i])
			{
				possible=a[i];
			}
			if (fmax>possible)
			{
				smax=possible;
			}
		}
		int possible1=0;
		for (int i = 0; i < a.length; i++) {
			if (tmax<a[i])
			{
				possible1=a[i];
			}
			if (smax>possible1)
			{
				tmax=possible1;
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
		System.out.println(tmax);
	}

}
