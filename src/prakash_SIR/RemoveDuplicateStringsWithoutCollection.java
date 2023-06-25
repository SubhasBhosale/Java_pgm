package prakash_SIR;

public class RemoveDuplicateStringsWithoutCollection 
{
	public static void main(String[] args) 
	{
		String[] a={"hello","hi","hello","hi"};
		for (int i = 0; i < a.length; i++)
		{
			boolean flag=false;
			String s = a[i];   //hello
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i].equals(a[j]))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(a[i]);
			}
		}
	}
}
