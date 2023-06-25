package Practice_Character_G1;

import java.util.LinkedHashSet;

public class G15_RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		String a="subhas";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++)
		{
			set.add(a.charAt(i));	
		}

		System.out.println(set);   //this will print in array format
		
		for (Character s : set) 
		{
			System.out.print(s);   //this is in character formate
		}
	}

}
