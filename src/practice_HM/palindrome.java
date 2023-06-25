package practice_HM;

public class palindrome {

	public static void main(String[] args) {
		String a="malayalam";
		String b="";
		for (int i = a.length()-1; i >=0; i--) 
		{
			b=b+a.charAt(i);
		}
		if(b.equals(a))  //equals bcz we are comparing with string
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}
