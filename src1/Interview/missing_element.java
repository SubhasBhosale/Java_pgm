package Interview;

public class missing_element 
{	public static void main(String[] args)
	{
		int[] a={7,12,10,13,20,11,14};
		int fis_max=a[0];
		int min=a[0];
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
		for (int i = min; i <= fis_max; i++)
		{
			boolean flag=false;
			for (int j = 0; j < a.length; j++)
			{
				if (i==a[j])
				{
					flag=true;
					break;
				}
			}
			if (flag==false)
			{
				System.out.print(i+" ");
			}
		}}}