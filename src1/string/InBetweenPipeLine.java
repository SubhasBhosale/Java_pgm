package string;

public class InBetweenPipeLine 
{
	public static void main(String[] args) 
	{
		String a="I|from//banga//|lore";
		String[] b = a.split("[|]");
		for (int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}