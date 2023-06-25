package Pearson;

public class ReverseInteger 
{
	public static void main(String[] args) 
	{
		int a=345;
		int sum=0;
		while (a!=0) 
		{
			int z=a%10;
			sum=sum*10+z;
			a=a/10;
		}
		System.out.println(sum);
	}
}