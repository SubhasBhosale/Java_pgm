package Number;

public class SumToSingleDigit_
{
	static int sum=0;
	public static int sum(int a)
	{
		while(a!=0)
		{
			int b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
		return sum;
	}


	public static void main(String[] args) 
	{
		sum(66778);
		while(sum>9)
		{
			int	b=sum;
			a=b;
		}
	}
}

