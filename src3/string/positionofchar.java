package string;


public class positionofchar {
public static void main(String[] args) {
	String st = "Test";
	String s = st.toLowerCase();
	java.util.LinkedHashSet<Character> set = new java.util.LinkedHashSet<>();
	
	
	for (int i = 0; i < s.length(); i++) 
	{
		set.add(s.charAt(i));
	}
	
	
	for (Character  ch : set) 
	{	
		for (int i = s.length()-1; i >0; i--) 
		{
			if(ch==s.charAt(i))
			{
				System.out.println(ch+" is in "+(i+1)+"position");
			}
		}
	}
}
}
