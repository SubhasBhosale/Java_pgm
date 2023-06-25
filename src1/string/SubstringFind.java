package string;

public class SubstringFind 
{
	public static void main(String[] args) 
	{
		String a="Testing";
		String b = a.toLowerCase();
		String s="ti";
		
		boolean flag=true;
		for (int i = 0; i < b.length(); i++)
		{
			String c="";
		//	if(b.charAt(i)=='s')	
			for (int j = i; j < b.length(); j++)
			{
				 c=c+b.charAt(j);
				 if (c.equals(s))
				 {
					 flag=false;
					 break;			 
				}
			}
		}
		if (flag==false)   //why bcz it is value like true or false
		{
			System.out.print("substring is present");
		}
		else
		{
			System.out.println("substring is not present");
		}
	}

}
