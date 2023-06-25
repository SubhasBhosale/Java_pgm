package practice_HM;

import java.util.LinkedHashSet;

public class noOfWordsRepeating {

	public static void main(String[] args) {
		String st="I am from am Bangalore";
		String b = st.toLowerCase();
		String[] a = b.split(" ");  //String return type
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();  //String return type
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		
		for (String s : set)
		{
			int count=0;
			for (int j = 0; j < a.length; j++)
			{
				if (s.equals(a[j])) 
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(s+" repeating for "+count+" times");
			}
		}
		
		
		
		
		
	}

}
