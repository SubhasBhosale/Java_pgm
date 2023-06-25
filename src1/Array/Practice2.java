package Array;

public class Practice2 
{
	public static void main(String[] args) 
	{
		int[] a={1,1,3,6,7,9,9};
		int fis_max=0;
		int sec_max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (fis_max<a[i])
			{
				fis_max=a[i];
			}
			else if(sec_max>a[i])
			{
				sec_max=a[i];
			}
		}
		System.out.println(fis_max);
		System.out.println(sec_max);
	}
}