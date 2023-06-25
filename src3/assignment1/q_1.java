package assignment1;

import java.util.LinkedHashSet;

public class q_1 {

	public static void main(String[] args) {
			String a="aaabbcdddf";     //==>> a3b2cd3f
			char[] b = a.toCharArray();
			LinkedHashSet<Character> set = new LinkedHashSet<>();
			for (int i = 0; i < b.length; i++) 
			{
				set.add(b[i]);
			}
			for (Character s : set) 
			{
				int count=0;
				for (int j = 0; j < b.length; j++) 
				{
					if (s==b[j]) 
					{
						count++;
					}
				}
				if (count>1) 
				{
				System.out.print(s+""+count);	
				}
				if(count==1)
				{
					System.out.print(s);
				}
			}
	}

}
