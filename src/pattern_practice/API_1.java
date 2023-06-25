package pattern_practice;

public class API_1 
{
	public static void main(String[] args)
	{
		int z=9999;
		while(z>9)
		{
			int sum=0;
			while(z>0)
			{
				int a=z%10;
				sum=sum+a;
				z=z/10;
			}
			System.out.println(sum);
			z=sum;
		}
	}
}

