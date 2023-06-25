package String_wihtoutcollection;

public class practice 
{
	public static void main(String[] args) 
	{
		String a = "aaabbcccaa";		// a3b2c3a2
		
		for (int i = 0; i < a.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < a.length(); j++) 
			{
				if (a.charAt(i)==a.charAt(j)) 
				{
					count++;
				}
				else
				{
					i=j-1;
					break;
				}
			}
			System.out.print(a.charAt(i)+""+count);
		}
	}
}