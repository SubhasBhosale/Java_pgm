package practice_HM;

import java.util.LinkedHashSet;

public class countVowelsavoidduplicates {
public static void main(String[] args) {
	String a="softwaretesting";
	char[] b = a.toCharArray();
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for (int i = 0; i < b.length; i++) {
		set.add(b[i]);
	}
	int count=0;
	for (Character s : set) 
	{
		if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u') 
		{
		     count++;
		}
	}
	System.out.println(count);
}
}
