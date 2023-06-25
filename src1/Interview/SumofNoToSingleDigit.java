package Interview;

public class SumofNoToSingleDigit 
{
	private static int test(int n)
	{
		int sum=0;
		while(n>0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) 
	{
		int g = test(778899);
		while(g>9)
		{
			int w = test(g);
			g=w;
		}
	}
}