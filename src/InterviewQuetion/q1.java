package InterviewQuetion;

import java.util.LinkedHashSet;

public class q1 {

	public static void main(String[] args) {
			String a="https";                       //no of occurance
			
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for (int i = 0; i < a.length(); i++) {
				set.add(a.charAt(i));
			}
			
			for (Character s : set) 
			{	
			int count=0;	
				for (int i = 0; i < a.length(); i++)
				{
					if (s.equals(a.charAt(i))) 
					{
						count++;
					}
				}
				System.out.println(s+" "+count);
			}
	}

}
