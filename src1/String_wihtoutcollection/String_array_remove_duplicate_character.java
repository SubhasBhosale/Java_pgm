package String_wihtoutcollection;

public class String_array_remove_duplicate_character 
{
	public static void main(String[] args) 
	{
		String[] a= {"abkkcc","abbcpppd","abbbddddddeeee"};
		String[] b=new String[a.length];

		for (int i = 0; i < a.length; i++)
		{
			String str = a[i];
			for (int j = 0; j < str.length(); j++)
			{
				boolean flag=false;
				for (int k = j+1; k < str.length(); k++) 
				{
					if (str.charAt(j)==str.charAt(k)) 
					{
						flag=true;
						break;
					}
				}
				if(flag==false)
					System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
