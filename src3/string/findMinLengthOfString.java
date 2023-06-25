package string;

import java.util.Iterator;

public class findMinLengthOfString {
public static void main(String[] args) {
	
	String[] s= {"ab","a","abc","abcd","b"};     //o/p => a b
	String min_len=s[0];
	for (int i = 0; i < s.length; i++) {
		if (min_len.length()>s[i].length()) 
		{
			min_len=s[i];
		}
	}
	for (int i = 0; i < s.length; i++) {
		if(min_len.length()==s[i].length())  
		//then min_lenth = a (through execution)
		{
			System.out.println(s[i]);
		}
	}
}
}
