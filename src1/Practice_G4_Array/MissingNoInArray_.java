package Practice_G4_Array;

public class MissingNoInArray_ 
{
	public static void main(String[] args) 
	{
		int[] a= {1,3,6,2};
		int[] b=new int[10-a.length];
		int index=0;
		for (int i = 1; i <= 6; i++) 
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
				System.out.println(i);		
//				b[index]=i;
//				index++;
			}}
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.print(b[i]+" ");
//		}
	}
}
