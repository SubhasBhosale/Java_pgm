package factorial;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) 
	{
		
		for(;;)
		{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			System.out.println(a);
			int mul=1;
			while(a!=0)
			{
				mul=mul*a;
				a--;
			}
			System.out.println(mul);
		}
		
	}
}
//0 7 8 9 10 2 6 1 
//0 7 10 2 6 9 8 1 