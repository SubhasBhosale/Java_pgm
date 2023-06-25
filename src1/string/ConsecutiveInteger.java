package string;
public class ConsecutiveInteger 
{
	public static void main(String[] args)
	{
		String a="a1b12345gh20d";
		char[] b = a.toCharArray();
		String c="";
		int count=0;
		for (int i = 0; i < b.length; i++)
		{	
			if (b[i]>='0' && b[i]<='9')
			{
				count++;
				c=c+b[i];
			}
			else 
			{
				c="";
				count=0;
				//break;   //this will break the loop and terminate the loop itself
			}
			if (count>4)
			{
				System.out.println(c);	
			}	
		}
	}
}