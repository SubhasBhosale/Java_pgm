package string;

public class removeDuplicateCharacterFromString 
{
     public static String removeDuplicateChar(String a)
	{
    	 String b="";
    	for (int i = 0; i < a.length(); i++) 
    	{
    		if (b.indexOf(a.charAt(i))==-1) // b string not containing a's character
    		{
				b+=a.charAt(i);
			}
		}  	 
		return b;
	}
	public static void main(String[] args) 
	{		
	System.out.println(removeDuplicateChar("hare krishna"));	
	}
}