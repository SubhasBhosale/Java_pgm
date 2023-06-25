package practice_HM;

import java.util.HashSet;

public class occuranceUsingMap {
public static void main(String[] args) {
	String arr="TestYantra";
    char[] abb=new char[arr.length()];   //length
	abb=arr.toCharArray();
     
     
     /*for (int i = 0; i < arr.length(); i++) 
	{
		abb[i]=arr.charAt(i);
	}*/
	for (char c : abb) 
	{
		System.out.print(c+" ");
	}
	HashSet<Character> set = new  HashSet<>();
	for (int i = 0; i < arr.length(); i++) 
	{
		set.add(abb[i]);
	}
	System.out.println();
	for (char d : set) {
		System.out.print(d+" ");
	}
}
}
