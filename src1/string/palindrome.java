package string;

import java.util.Iterator;

public class palindrome {
public static void main(String[] args) {
	String a="malayalam";
	String b="";
	for (int i = a.length()-1; i>=0 ; i--) {
		b=b+a.charAt(i);
	}

	if (b.equals(a))   //malayalam.equals(malayalam)  //equals bcz we are comparing with string
	{
		System.out.println(a+" ==>> String is palindrome");
	} else {
		System.out.println(a+" ==>> String is not palindrome");
	}
	
}
}
