package Practice_Character_G1;

import java.util.LinkedHashSet;

public class G11
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,2,3,4,5,6,6};
		LinkedHashSet<Integer> set = new	LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}

		for (Integer s : set) 
		{
			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if (s==a[i])
				{
					count++;
				}
			}
		
		System.out.println(s+"==> "+count);
		}
		
	}

}
