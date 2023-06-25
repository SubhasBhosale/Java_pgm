package Interview;

public class Aswin 
{
	public static void main(String[] args) 
	{
		int[] a= {7,12,10,13,8,8,7,6,11,14};
		int fis_max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if (fis_max<a[i])
			{
				fis_max=a[i];
			}
			else  if (min>a[i])
			{
				min=a[i];
			}
		}
			
		System.out.println(fis_max);
		System.out.println(min);
	}
}
