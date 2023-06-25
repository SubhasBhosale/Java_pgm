package Array;

public class addArray1 {

	public static void main(String[] args)
	{
		int[] a= {2,4,1,5,6};
		int[] b= {3,2,4,1};
		int c=0;

		for (int i = 0; i < a.length; i++) 
		{
			try {
				System.out.print((a[i]+b[i])+" ");
			}
			catch(Exception e)
			{
				if (a.length>b.length)
				{
					System.out.println(a[i]);
				}
			}
		}

	}
}
