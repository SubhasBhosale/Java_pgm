package string;

public class String_1_reverse {
	public static void main(String[] args) {
		String s="nitin";
		char[] a = s.toCharArray();
//		for (int i = s.length()-1; i >= 0 ; i--) {
//			System.out.print(s.charAt(i)+" ");
//		}
//		int count=0;
//		for (char c : a) {
//			count++;
//		}
	//	System.out.println(count);
		
//		for (int i = count-1; i >= 0; i--) 
//		{
//			System.out.println(s.charAt(i));
//		}
//		
		
		String b="";
		for (int i = s.length()-1; i >=0 ; i--)
		{
			b=b+s.charAt(i);
		}
		if (b.equals(s))
		{
		System.out.println("palindrome");	
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
	}
}
