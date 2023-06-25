package Array;

public class Add_array_3rdArray {
	public static void main(String[] args) 
	{
		int[] a= {2,4,1,5,6};
		int[] b= {3,2,4,1};
		int[] c=new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			try
			{
				c[i]=a[i]+b[i];
			}
			catch (Exception e)
			{
				c[i]=a[i];				
			}
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
