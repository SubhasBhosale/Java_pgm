package prime_new;

import java.util.Scanner;

public class primeno_OLD_SCANNER_CLASS {    // 0 & 1 are not prime no

	public static void main(String[] args) {
		//int a=7;

		for(;;)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no =>");
			int a = sc.nextInt();
			int count=0;
			for (int i = 1; i <=a; i++) 
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if (count==2) 
			{
				System.out.println(a+" is prime no");	
			}
			else
			{
				System.out.println(a+" is not prime no");
			}
		}
	}
}
