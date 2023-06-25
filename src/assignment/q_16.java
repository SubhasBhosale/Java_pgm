package assignment;

import java.util.Iterator;
import java.util.Scanner;

public class q_16 {

	public static void main(String[] args) 
	{
			int[] a= {5,1,2,3,4};
			for(;;)
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Key ==>> ");
			int count = sc.nextInt();
		
			for (int i = 0; i < a.length; i++) 
			{
				if (count==1) 
				{
					System.out.println(a[0]);
					break;
				} else if(count==2)
				{
					System.out.println(a[0]+a[1]);
					break;
				}
				else if(count==3)
				{
					System.out.println(a[0]+a[1]+a[2]);
					break;
				}
			}
	}
	}
}
