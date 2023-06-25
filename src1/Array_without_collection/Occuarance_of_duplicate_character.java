package Array_without_collection;

public class Occuarance_of_duplicate_character 
{
	public static void main(String[] args) 
	{
		String a="Subhas";
		String b = a.toLowerCase();
		char[] c = b.toCharArray();

		for (int i = 0; i < c.length; i++) 
		{
			int count=0;
			for (int j = i; j < c.length; j++) 
			{
			
				if (c[i]==c[j]) 
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(c[i]+" "+count);
			}
		}
	}
}
