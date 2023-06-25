package pattern_practice;

public class API_3 {
	public static int test(int z)
	{
		int sum=0;
		while(z>0)
		{
			int	a=z%10;
			sum=sum+a;
			z=z/10;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args)
	{
		int sum=0;
			sum=test(998877);
			while (sum>9)
			{
				int value = test(sum);
				sum = value;
			}
	}
}
