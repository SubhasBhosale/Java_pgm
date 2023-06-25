package prakash_SIR;

public class aaabbcdddf__a3b2cd3f_only_1_forLoop 
{
	public static void main(String[] args) 
	{
		String a="aaabbcdddff";   //a3b2cd3f
		int count=1;
		for(int i=0;i<a.length();i++)
		{
			try {	
				if(a.charAt(i)==a.charAt(i+1))
				{
					count++;	
				}
				else
				{
					System.out.print(a.charAt(i)+""+count);
					count=1;
				}
			}
			catch(Exception e) 
			{
				System.out.print(a.charAt(i)+""+count);
			}
		}
	}
}
