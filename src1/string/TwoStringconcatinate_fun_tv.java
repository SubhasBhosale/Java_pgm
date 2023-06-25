package string;

import java.util.LinkedHashSet;

public class TwoStringconcatinate_fun_tv 
{
	public static void main(String[] args) 
	{
		String s1 = "new tv show";
		String s2 = "this is tv show"; //this is new
		String z = s2+" "+s1;
		//System.out.println(z);
		String[] a = z.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) 
		{
			//System.out.print(a[i]+" ");		
			set.add(a[i]);
		}
	//	System.out.println(set);
		for (String s : set)
		{
			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if (s.equals(a[i]))
				{
					count++;
				}
			}
			if (count==1) 
			System.out.print(s+" ");
		}
	}
}
