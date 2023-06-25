package Array_without_collection;

public class MissingElementsInArray 
{
	public static void main(String[] args) 
	{
		int[] a={7,6,6,12,10,13,11,16,20,20,19};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if(min>a[i])
			{
				min=a[i];
			}
		}
		for (int i = min; i <= max; i++)
		{
			boolean flag=false;
			for (int j = 0; j < a.length; j++) 
			{			
				if (i==a[j]) 
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
				}
			}
			if (flag==false) 
			{
				System.out.print(i+" ");
			}
		}
	}
}
