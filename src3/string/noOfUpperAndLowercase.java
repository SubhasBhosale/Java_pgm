package string;

import java.util.Scanner;

public class noOfUpperAndLowercase {
public static void main(String[] args) {
	String a="TestYantra";
	for (;;)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int uppercase=0;
		int lowercase=0;
	
	for (int i = 0; i < s.length()-1; i++) {
		if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
		{
			uppercase++;
		}
		else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
		{
			lowercase++;
		}
	}
	System.out.println("no of uppercase"+uppercase);
	System.out.println("no of lowercases"+lowercase);
	}
}
}
