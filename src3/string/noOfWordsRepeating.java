package string;

import java.util.LinkedHashSet;

public class noOfWordsRepeating {
	public static void main(String[] args) {
		String st="I am from am Bangalore";
		String str = st.toLowerCase();
		String[] s = str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length; i++) 
		{
			set.add(s[i]);
		}
		for (String str1 : set) 
		{
			int count=0;
			for (int i = 0; i < s.length; i++) 
			{
				if(str1.equals(s[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(str+" repeating "+count+" time");
			}
		}



	}
}
