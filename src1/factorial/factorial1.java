package factorial;

import java.util.Scanner;

public class factorial1 {
	public static void main(String[] args) {
		for(;;)             //multiple times we can give value as a input and get the result
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter no => ");
			int n = sc.nextInt();
			int fact=1;
			for (int i = 1; i <=n; i++) 
			{
				fact=fact*i;
			}
			System.out.println("result => "+fact);
		}   
	}


}
