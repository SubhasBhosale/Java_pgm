package interview_quetions;

public class SONY_CheckifStringPresentOrNot 
{
	public static void main(String[] args) 
	{
		String a = "iamtester";
		String b="test";
		boolean flag = false;
		for (int i = 0; i < a.length(); i++) 
		{
			if(a.charAt(i)== b.charAt(i))
			{
			String temp = "";
				for (int j = i; j < a.length(); j++)
				{
					temp += a.charAt(j);
					System.out.println(temp);
					if (temp.equals(b))
					{
						System.out.println("Present");
						flag = true;
						break;
					}
				}	}
				if(flag==true)
				{
					break;
				}
		}
		if(!flag)
			System.out.println("Not present");
	}
}
