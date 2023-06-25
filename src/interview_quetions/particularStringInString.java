package interview_quetions;

public class particularStringInString 
{
	public static void main(String[] args) 
	{
		String a="javaisprogramminglanguage";
		String b="javi";
		int i,j=0;
		for ( i = 0; i <=a.length()-b.length(); i++)
		{
			for (j = 0; j < b.length(); j++)
			{
				if (a.charAt(i+j)!=b.charAt(j))
				{
					break;
				}
			}
			if(j==b.length())
			{
				System.out.println("Word is present");
				break;
			}
		}


		if(i>a.length()-b.length())
		{
			System.out.println("Word is not present");
		}
	}

}

/*1
12
4
53
7345234
 */