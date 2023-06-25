package String_wihtoutcollection;

public class _aaabbcccdda {

	public static void main(String[] args) 
	{
		String a = "aaabbcccaa";		// a3b2c3a2
		int count = 1;
		for (int i = 0; i < a.length(); i++) 
		{
			if (i == a.length() - 1 || a.charAt(i) != a.charAt(i + 1)) 
			{
				System.out.print(a.charAt(i));
				System.out.print(count);
				count = 1;
			} 
			else
			{
				count++;
			}
		}
	}
}