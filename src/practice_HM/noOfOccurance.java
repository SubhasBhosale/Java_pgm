package practice_HM;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class noOfOccurance {

	public static void main(String[] args) {
			String b="Test";
			String a = b.toLowerCase();
			LinkedHashSet<Character> set = new LinkedHashSet<>();
			for (int i = 0; i < a.length(); i++) 
			{
				set.add(a.charAt(i));
			}
			
			for (Character s : set)
			{
				int count=0;
				for (int j = 0; j < a.length(); j++) 
				{
					if (s.equals(a.charAt(j)))
					{
						count++;
					}
				}
				System.out.println(s+" is repeating for "+count+" times");
				/*if (count>1) 
				{
					System.out.println(s+" is repeating for "+count+" times");
				}
				if (count==1) 
				{
					System.out.println(s+" is repeating for "+count+" times");
				}*/
			}
	}

}
