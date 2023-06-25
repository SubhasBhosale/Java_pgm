package InterviewQuetion;

import java.util.LinkedHashSet;

public class q2 {

	public static void main(String[] args) {
		String[] a= {"mango","apple","mango","apple","orange","grape","watermelon"};
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
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
			if(count==2)
			{
				System.out.println(s);
			}
		}
	}

}
