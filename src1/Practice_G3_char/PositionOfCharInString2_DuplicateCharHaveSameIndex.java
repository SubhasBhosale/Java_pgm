package Practice_G3_char;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfCharInString2_DuplicateCharHaveSameIndex {
	public static void main(String[] args) {
		String[] s = {"mango","apple","mango","grape"};
		//int count=0;
		ArrayList<String> set = new ArrayList<String>();	
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		//System.out.println(set);
		for (String str: set) 
		{
			for (int i = 0; i < s.length; i++) 
			{
				if (str.equals(s[i]))
				{
//					System.out.println(ch+" "+s[i]);
//					System.out.println(ch==s[i]);
					System.out.println(str+" "+(i+1)); 
					break;
				}
			}
			/*for (int i = s.length()-1; i >=0; i--)
			{
				if (ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1)); 
					break;
				}

			}*/
		}
	}
}