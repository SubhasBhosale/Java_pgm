package practice_java;

public class array_sort_0_1_ 
{
	public static void main(String[] args) 
	{
		int[] a= {1,0,1,1,1,0,0,1};
		int[] b = new int[a.length];
		
		int m=0;
		int n=a.length-1;
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]==0)
			{
			   b[m]=a[i];
			   m++;
			}
			if(a[i]==1)
			{
				b[n]=a[i];
				n--;
			}
			System.out.println(b[i]);
		}
	}
}
