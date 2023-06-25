package array1;

public class _0_1_Sort_Unique 
{
	public static void main(String[] args) 
	{
		int[] arr= {0,0,1,0,1};
		int[] b=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]!=0)
			{
				b[m]=arr[i];
				m++;
			}
			else
			{
				b[n]=arr[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
		//this logic is to seperate only 0 and 1
	}
}














/*	int no=0;
	int no1=1;

	for (int i = 0; i < arr.length; i++) {
		if(no==arr[i])
		{
			no=arr[i];
			System.out.println(arr[i]);
		}
		}
	for (int j = 0; j < arr.length; j++) 
	{
	    if(no1==arr[j])
	    {
	    	System.out.println(arr[j]);
	    }
	}*/