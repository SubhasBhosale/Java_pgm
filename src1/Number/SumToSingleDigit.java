package Number;

import java.util.Scanner;

public class SumToSingleDigit 
{
	public static int multiple(int a)
	{
		int sum=0;
		while(a>0)
		{
			int z=a%10;
			sum=sum+z;
			a=a/10;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) 
	{
		for(;;)
		{
			Scanner sc = new	Scanner(System.in);
			int x = sc.nextInt();
			while(x>9)
			{
				int	r=multiple(x);
				x=r;
			}
		}
	}
}