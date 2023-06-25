package Recursion;

public class practice 
{
	public static void no(int start,int end)
	{
		if (start<=end) 
		{
			System.out.print(start+" ");
			start++;
			no(start,end);
		}
	}
	public static void main(String[] args) 
	{
		no(1,10);
	}
}
