package Practice_String_G2_word;

import java.util.LinkedHashSet;

public class G22_PrintOnlyDuplicateWordinSentence {

	public static void main(String[] args) {
		String s ="WELCOME TO INDIA TO MANDYA";
		String[] a = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (String g : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (g.equals(a[i]))
				{
					count++;
				}
			}
			if (count==2) 
			System.out.println(g+" "+count);
		}
	}
}
