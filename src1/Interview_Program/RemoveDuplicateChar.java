package Interview_Program;

public class RemoveDuplicateChar
{
	public static String removeDuplicate_ValueOf(String s)
	{
		String temp = "";
		for (int i = 1; i < s.length(); i++) 
		{		
			if (!temp.contains(String.valueOf(s.charAt(i))))
			{
				temp += s.charAt(i);
			}	
		}
		return temp;
	}
	
	public static String removeDuplicate_indexOf(String a)
	{
		String b="";
		for (int i = 0; i < a.length(); i++) 
		{
			if (b.indexOf(a.charAt(i))==-1) //b is not matching with a's characters
			{
				b+=a.charAt(i);
			}
		}
		return b;
	}
	
	public static void main(String[] args) 
	{
		String s = "subhas";
	System.out.println(removeDuplicate_ValueOf(s));
	System.out.println(removeDuplicate_indexOf(s));
	}
}