package pattern;

import java.util.Scanner;

public class Practice 
{
	public static int test(int n)
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
		for(;;)
		{
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t>9)
			{
				int p = test(t);
				t=p;
			}
		}
	}
}

/*
777889
46
10
1

11227799
38
11
2

 */

