package prakash_SIR;

public class PrintNoInString 
{
	public static void main(String[] args) 
	{
		String a="ab1@2ed34";
		for (int i = 0; i < a.length(); i++) 
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				System.out.print(a.charAt(i));
			}
		}
	}
}
