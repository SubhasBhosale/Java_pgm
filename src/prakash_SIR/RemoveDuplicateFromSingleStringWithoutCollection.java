package prakash_SIR;

public class RemoveDuplicateFromSingleStringWithoutCollection {
	public static void main(String[] args) 
	{
		String b="subhas";
		for(int i=0;i<b.length();i++)
		{
			boolean flag=false;
			for (int j = i+1; j < b.length(); j++) 
			{
				if(b.charAt(i)==b.charAt(j))
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.print(b.charAt(i));
			}
		}

	}

}
