package pattern_practice;

import java.util.Scanner;

public class API_2 
{
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
		for (;;)
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int sum=0;
			sum = a;
			while (sum>9)
			{
				int value = test(sum);  
//bcz every time the value will be change from 
//the method so we are storing in some variable
				sum = value;
			}
		}
	}
}
