package assignment;

import org.bouncycastle.jcajce.interfaces.BCX509Certificate;

public class online {
	public static void main(String[] args) {
		int[] a= {1,4,7,8,5,9};
		int[] b= {9,6,8,7,5};
		
		for (int i = 0; i < a.length; i++)
		{
			try
			{
			     System.out.println(a[i]+b[i]);
			}
			catch (Exception e) 
			{
				if (a.length>b.length) 
				{
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
			
			}

       
		





}}
