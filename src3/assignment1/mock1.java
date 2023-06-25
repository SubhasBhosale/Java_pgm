package assignment1;

public class mock1 {

	public static void main(String[] args) 
	{
		String s1="a11b22c33";
		char[] b = s1.toCharArray();

		for (int i = 0; i < b.length; i++)
		{
			for (int j = i+1; j < b.length; j++) 
			{
				if(b[i]==b[j])
				{
					if(b[i]=='1' || b[i]=='2') 
					{	
						System.out.print(b[i]);
					}
				}
			}
		}
	}

}
