package practice_HM;

import java.util.LinkedHashSet;

public class noOfDuplicatesInString {
public static void main(String[] args) {
	String a="Test";
	String b = a.toLowerCase();
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for (int i = 0; i < b.length(); i++) {
		set.add(b.charAt(i));
	}
	for (Character s : set) 
	{
		int count=0;
		for (int j = 0; j < b.length(); j++) 
		{
			if(s==b.charAt(j))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(s+" is repeating for "+count);
		}
	}
}
}
