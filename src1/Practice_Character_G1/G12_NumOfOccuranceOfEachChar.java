package Practice_Character_G1;

import java.util.LinkedHashSet;

public class G12_NumOfOccuranceOfEachChar {

	public static void main(String[] args) {
		String s ="SUBHAS";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}

		for (Character b : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
			if(b==s.charAt(i))
				count++;
			}
			System.out.println(b+" ==>"+count);
		}
	}

}
