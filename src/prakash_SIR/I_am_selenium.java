package prakash_SIR;

public class I_am_selenium 
{
	public static void main(String[] args) 
	{
		String a="i am selenium";  		//m ui nelesmai   
		String b = a.replace(" ", "");
		
		int count=1;
		for (int i = b.length()-1; i >=0; i--) 
		{
			if(count==1)
			System.out.print(b.charAt(i)+" ");
			else if(count==3)
			{
				System.out.print(b.charAt(i)+" ");
			}
			else 
			{
			System.out.print(b.charAt(i));
			}
			count++;	
		}

	}
}
