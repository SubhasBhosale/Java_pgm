package string;

import java.util.LinkedHashSet;

public class countVowelsAvoidDuplicate {
public static void main(String[] args) {
	String st="softwaretesting";
	char[] a = st.toCharArray();
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for (int i = 0; i < a.length; i++) 
	{
		set.add(a[i]);
	}
	int count=0;
	for (Character ch:set)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
			System.out.println(ch);
		}
	
	}
	System.out.println("no of vowels "+count);
	
}
}
