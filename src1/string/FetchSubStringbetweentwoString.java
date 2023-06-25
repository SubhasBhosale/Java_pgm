package string;

public class FetchSubStringbetweentwoString 
{
	public static void main(String[] args) 
	{
		String z = "ship cushion cash";
		String[] a = z.split(" ");
		String b = a[0];               //ship
		
	//	for (int i = 1; i < a.length; i++) 
		{
			String c = a[1];
			for (int j = 0; j < c.length(); j++) 
			{
				for (int k = 0; k < b.length(); k++)
				{
					if (b.charAt(k)==c.charAt(j))
					{
						System.out.print(c.charAt(j));
					}
				}			
			}
		}
	}

}



















/*
 * 
 * 
 * 	System.out.println(b.charAt(k)==c.charAt(j));
				//	String comm="";
					if (b.charAt(k)==c.charAt(j))
					{
						//comm=comm+c.charAt(i);
						System.out.print(c.charAt(j)+"***************");
						break;
					}
 * 
 * 
 * 
 */