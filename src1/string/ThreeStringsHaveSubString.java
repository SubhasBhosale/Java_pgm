package string;

public class ThreeStringsHaveSubString 
{
	public static void main(String[] args) 
	{
		String z = "shpi cushion";
		String[] s = z.split(" ");
		String a = s[0];

		for (int i = 0; i < a.length(); i++)
		{
			String p="";
			for (int j = 1; j < s.length ; j++)
			{
				String b = s[j];
				for (int k = 0; k < b.length(); k++) 
				{
					if (b.charAt(k)==a.charAt(i))
					{
						p=p+a.charAt(i);			
					}
				}
			}
			System.out.print(p);	
		}	
	}
}
// cash