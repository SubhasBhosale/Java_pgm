package Practice_String_G2_word;

import java.util.LinkedHashSet;

public class G21_NumOfOccOfEachWord {

	public static void main(String[] args) {
		String s ="WELCOME TO INDIA TO MANDYA";
		String[] b = s.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < b.length; i++) 
		{
			set.add(b[i]);
		}

		for (String t : set)
		{
			int count=0;
			for (int i = 0; i < b.length; i++)
			{
				if(t.equals(b[i]))
				{
					count++;
				}
			}
			System.out.println(t+" "+count);
		}

	}

}
